create or replace package cf_agentflow_pkg is

        --Created : 2013/9/6  AM 09:14:51
        --Purpose : pr/po for AgentFlow 
        --update 131025 
        --main for test  
        procedure main;

        --for schedule insert  into cf_af_requisitions_interface to test 
        procedure insert_into_af_iface(errbuff out varchar2,
                                       retcode out varchar2);

        procedure insert_into_af_pr_iface_inv;

        procedure insert_into_af_pr_iface_exp;

        --for schedule insert  pr informations into pr interface  
        procedure import_pr_iface_all;

        --interface for concurrent program  
        procedure import_pr_iface_all(errbuff out varchar2,
                                      retcode out varchar2);

        --for schedule insert  into cf_af_po_interface 
        procedure insert_af_po_iface;

        procedure insert_af_po_iface_addition;

        --interface for concurrent program  
        procedure insert_af_po_iface_all(errbuff out varchar2,
                                         retcode out varchar2);

        --interface for  approve or reject po concurrent program  
        procedure approve_or_reject_po(errbuff out varchar2,
                                       retcode out varchar2);

        procedure approve_or_reject_po;

        --import from af po interface 
        function import_po_iface_all return varchar2;

        --validate agents  for agentflow form 
        function validate_agents(p_agent_id in number) return number;

        --validate preparer id  for agentflow form 
        function validate_preparer_id(p_employee_num in varchar2) return varchar2;

        function get_preparer_id(p_employee_num in varchar2) return number;

        --validate requestor id for agentflow form 
        function validate_requestor_id(p_employee_num in varchar2) return varchar2;

        function get_requestor_id(p_employee_num in varchar2) return number;

        --get deliver_to_location_id 
        function get_deliver_to_location_id(p_location_code in varchar2)
                return number;

        --validate uom for agentflow form 
        function validate_uom(p_uom in varchar2) return varchar2;

        --get lastest  three po 
        function get_last_five_po_html(p_inventory_item_id in number)
                return varchar2;

        function get_last_3_po_date(p_inventory_item_id in number,
                                    p_num in number,
                                    p_org_id in number default 84) return date;

        function get_last_3_po_vendor(p_inventory_item_id in number,
                                      p_num in number,
                                      p_org_id in number default 84)
                return varchar2;

        function get_last_3_po_qty(p_inventory_item_id in number,
                                   p_num in number,
                                   p_org_id in number default 84) return number;

        function get_last_3_po_price(p_inventory_item_id in number,
                                     p_num in number,
                                     p_org_id in number default 84) return number;

        --get last three month sum transaction quantitys 
        function get_qty_last_3_month_html(p_inventory_item_id in number)
                return varchar2;

        function get_qty_last_3_month(p_inventory_item_id in number,
                                      p_yyyymm in varchar2) return number;

        --get po history price for expense po 
        function get_po_history_price(p_description in varchar2) return varchar2;

        --get vendor list 
        procedure get_vendor_list(p_vendor in out cf_cv_type.po_type);

        --get  cfmrpr002 resultset 
        function get_cfmrpr002(p_mrp_name in varchar2) return varchar2;

        -- get quantity last month issued for agentflow form  
        function get_qty_last_mm_issued(p_item_id in number,
                                        p_organization_id in number default 86)
                return number;

        --get  mrp quantity for agentflow form  
        --p_item_id => inventory item id  
        --p_mm  => 0=N;1=N-1;2=N-2  
        function get_mrp_qty(p_item_id in number, p_mm in varchar2) return number;

        --get  quantity  on way for agentflow form  
        function get_qty_on_way(p_item_id in number,
                                p_org_id in number default 84) return number;

        --get   quantity  on hand for agentflow form  
        function get_qty_on_hand(p_item_id in number,
                                 p_organization_id in number default 86)
                return number;

        --get po num via pr num and line num 
        --ex:cf_agentflow_pkg.get_po_num_via_pr('3914',1) 
        --return '1310017-2'  po_number - line number 
        function get_po_num_via_pr(p_pr_segment1 in varchar2,
                                   p_pr_line_num in number) return varchar2;

        function get_pr_num_via_po(p_po_segment1 in varchar2,
                                   p_po_line_num in number) return varchar2;

        function get_pr_ansid(p_po_num_and_line in varchar2) return varchar2;

        --submit  request for requisitions import  
        procedure submit_reqimport;

        --get gl rate  for cf_po_interface_v  
        function get_gl_rate(f_currency_code in varchar2,
                             f_conversion_date in date) return number;

        --get po total  for cf_po_interface_v  
        function get_po_cf_total_sum(p_org_id in number,
                                     p_po_number in varchar2) return number;

        --sendmail   return=(0,success)(1,fail)  
        function send_mail_to_root(p_body in varchar2,
                                   p_subject in varchar2) return number;

        function get_host_name return varchar2;

        function get_err_html(p_app in varchar2, p_status in varchar2,
                              p_err in varchar2) return varchar2;

end cf_agentflow_pkg;
/
create or replace package body cf_agentflow_pkg is

        --org_id=84 kppc  
        --org_id=83 ekay  
        l_org_id constant number := fnd_profile.value('org_id');

        l_return number;

        procedure main is
                l_log varchar2(10);
        begin
                l_log := 'TEST4LOG';
                fnd_file.put_line(fnd_file.output,
                                  l_log);
        exception
                when others then
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end main;

        procedure insert_into_af_iface(errbuff out varchar2,
                                       retcode out varchar2) is
        begin
                cf_agentflow_pkg.insert_into_af_pr_iface_inv;
        end insert_into_af_iface;

        procedure insert_into_af_pr_iface_inv is
                l_iface_rec cf_af_requisitions_interface%rowtype;
                --       l_org_id    number := 84;
                l_user_id number := 2790;
        begin
                l_iface_rec.last_update_date            := sysdate;
                l_iface_rec.last_updated_by             := l_user_id;
                l_iface_rec.creation_date               := sysdate;
                l_iface_rec.created_by                  := l_user_id;
                l_iface_rec.last_update_login           := 4107006;
                l_iface_rec.org_id                      := 84;
                l_iface_rec.req_number_segment1         := to_char(sysdate,
                                                                   'mmddhhmiss');
                l_iface_rec.authorization_status        := 'INCOMPLETE';
                l_iface_rec.autosource_flag             := 'N';
                l_iface_rec.rfq_required_flag           := null;
                l_iface_rec.destination_type_code       := 'INVENTORY';
                l_iface_rec.requisition_type            := 'PURCHASE';
                l_iface_rec.source_type_code            := null;
                l_iface_rec.preparer_id                 := 3772;
                l_iface_rec.item_id                     := 9608;
                l_iface_rec.item_description            := null;
                l_iface_rec.line_type_id                := null;
                l_iface_rec.category_id                 := null;
                l_iface_rec.quantity                    := 300;
                l_iface_rec.unit_of_measure             := 'SET';
                l_iface_rec.unit_price                  := 90;
                l_iface_rec.need_by_date                := sysdate;
                l_iface_rec.suggested_buyer_id          := 1931;
                l_iface_rec.suggested_vendor_id         := 2805;
                l_iface_rec.currency_code               := 'JPY';
                l_iface_rec.currency_unit_price         := 300;
                l_iface_rec.rate                        := 0.3;
                l_iface_rec.rate_date                   := trunc(sysdate);
                l_iface_rec.rate_type                   := 1001;
                l_iface_rec.destination_organization_id := 86;
                l_iface_rec.destination_subinventory    := null;
                l_iface_rec.deliver_to_location_id      := 2390;
                l_iface_rec.deliver_to_requestor_id     := 3492;
                l_iface_rec.charge_account_id           := 14554;
                l_iface_rec.accrual_account_id          := 1230;
                l_iface_rec.oke_contract_num            := null;
                l_iface_rec.header_description          := 'PR Inventory';
                l_iface_rec.multi_distributions         := null;
                l_iface_rec.interface_source_code       := 'AgentFlow';
                l_iface_rec.batch_id                    := null;
                l_iface_rec.line_attribute1             := '1';
                l_iface_rec.note_to_buyer               := null;
                l_iface_rec.note_to_receiver            := null;
                insert into cf_af_requisitions_interface
                values l_iface_rec;
                commit;
        exception
                when others then
                        rollback;
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end insert_into_af_pr_iface_inv;

        procedure insert_into_af_pr_iface_exp is
                l_iface_rec cf_af_requisitions_interface%rowtype;
                -- l_org_id    number := 84;
                l_user_id number := 2790;
        begin
                l_iface_rec.last_update_date      := sysdate;
                l_iface_rec.last_updated_by       := l_user_id;
                l_iface_rec.creation_date         := sysdate;
                l_iface_rec.created_by            := l_user_id;
                l_iface_rec.last_update_login     := 4107006;
                l_iface_rec.org_id                := 84;
                l_iface_rec.req_number_segment1   := to_char(sysdate,
                                                             'mmddhhmiss');
                l_iface_rec.authorization_status  := 'INCOMPLETE';
                l_iface_rec.autosource_flag       := 'N';
                l_iface_rec.rfq_required_flag     := null;
                l_iface_rec.destination_type_code := 'EXPENSE';
                l_iface_rec.requisition_type      := null;
                l_iface_rec.source_type_code      := 'VENDOR';
                l_iface_rec.preparer_id           := 3772;
                l_iface_rec.item_id               := null;
                l_iface_rec.item_description      := '？？？？';
                l_iface_rec.line_type_id          := null;
                l_iface_rec.category_id           := 146;
                l_iface_rec.quantity              := 1;
                l_iface_rec.unit_of_measure       := 'SET';
                l_iface_rec.unit_price            := 90;
                l_iface_rec.need_by_date          := sysdate;
                --    l_iface_rec.suggested_buyer_id    := 1931; --Athena
                --   l_iface_rec.suggested_vendor_id   := 2805; --pj
                --         l_iface_rec.currency_code               := 'JPY'; --
                --        l_iface_rec.currency_unit_price         := 300;
                --        l_iface_rec.rate                        := 0.3; --
                --       l_iface_rec.rate_date                   := trunc(sysdate);
                --       l_iface_rec.rate_type                   := 1001;
                l_iface_rec.destination_organization_id := 86;
                l_iface_rec.destination_subinventory    := null;
                l_iface_rec.deliver_to_location_id      := 2390; --2390
                l_iface_rec.deliver_to_requestor_id     := 3492; --angel
                l_iface_rec.charge_account_id           := 14554; --AR Clearing
                l_iface_rec.accrual_account_id          := null;
                --     l_iface_rec.oke_contract_num            := 'contract_20131031'; --
                l_iface_rec.header_description    := 'PR EXPENSE';
                l_iface_rec.multi_distributions   := null;
                l_iface_rec.interface_source_code := 'AgentFlow';
                l_iface_rec.batch_id              := null;
                l_iface_rec.line_attribute1       := '1';
                insert into cf_af_requisitions_interface
                values l_iface_rec;
                commit;
        exception
                when others then
                        rollback;
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end insert_into_af_pr_iface_exp;

        procedure insert_af_po_iface is
                --         af_iface_rec cf_af_po_interface_b%rowtype;
                l_iface_rec cf_po_interface_v%rowtype;
                cursor l_cursor is
                        select *
                        from   cf_po_interface_v po
                        where  po.wf_item_key not in
                               (select distinct wf_item_key
                                from   cf_af_po_interface_b);
        begin
                --  savepoint start_trans;
                begin
                        open l_cursor;
                        loop
                                fetch l_cursor
                                        into l_iface_rec;
                                exit when l_cursor%notfound;
                                insert into cf_af_po_interface_b
                                values l_iface_rec;
                        end loop;
                        close l_cursor;
                exception
                        when others then
                                rollback;
                                raise_application_error(-20001,
                                                        sqlerrm);
                end;
                commit;
        end insert_af_po_iface;

        procedure insert_af_po_iface_addition is
                --af_iface_rec cf_af_po_interface_addition%rowtype;
                l_iface_rec cf_po_interface_addition_v%rowtype;
                cursor l_cursor is
                        select *
                        from   cf_po_interface_addition_v po
                        where  po.wf_item_key not in
                               (select distinct wf_item_key
                                from   cf_af_po_interface_addition);
        begin
                savepoint start_trans;
                begin
                        open l_cursor;
                        loop
                                fetch l_cursor
                                        into l_iface_rec;
                                exit when l_cursor%notfound;
                                insert into cf_af_po_interface_addition
                                values l_iface_rec;
                        end loop;
                        close l_cursor;
                exception
                        when others then
                                rollback to start_trans;
                                raise_application_error(-20001,
                                                        substr(sqlerrm,
                                                               1,
                                                               100));
                end;
                commit;
        end insert_af_po_iface_addition;

        procedure insert_af_po_iface_all(errbuff out varchar2,
                                         retcode out varchar2) is
        begin
                begin
                        insert_af_po_iface;
                        insert_af_po_iface_addition;
                exception
                        when others then
                                raise_application_error(-20001,
                                                        sqlerrm);
                end;
        end insert_af_po_iface_all;

        function import_po_iface_all return varchar2 is
        begin
                begin
                        insert into cf_po_interface_b
                                select null create_by, sysdate creation_date,
                                       null last_updated_by,
                                       null last_update_date,
                                       cf_process_flag, cf_process_msg,
                                       org_id, authorization_status,
                                       wf_item_type, wf_item_key, po_number,
                                       revision_num, line_num
                                from   cf_af_po_interface_b
                                where  wf_item_type || wf_item_key in
                                       (select wf_item_type || wf_item_key
                                        from   cf_po_interface_v
                                        where  org_id = l_org_id)
                                and    org_id = l_org_id
                                and    cf_process_flag is not null;
                        commit;
                        return 'Y';
                exception
                        when others then
                                rollback;
                                return 'N';
                                l_return := send_mail_to_root(p_body    => get_err_html(p_app    => 'import_po_iface_all',
                                                                                        p_status => 'Error',
                                                                                        p_err    => sqlerrm),
                                                              p_subject => 'About Function Error');
                                raise_application_error(-20001,
                                                        substr(sqlerrm,
                                                               1,
                                                               100));
                end;
        end import_po_iface_all;

        procedure approve_or_reject_po(errbuff out varchar2,
                                       retcode out varchar2) is
        begin
                begin
                        if import_po_iface_all = 'Y' then
                                approve_or_reject_po;
                        end if;
                exception
                        when others then
                                l_return := send_mail_to_root(p_body    => get_err_html(p_app    => 'approve_or_reject_po',
                                                                                        p_status => 'Error',
                                                                                        p_err    => sqlerrm),
                                                              p_subject => 'About Function Error');
                end;
        end approve_or_reject_po;

        procedure approve_or_reject_po is
                v_item_type    varchar2(100);
                v_item_key     varchar2(100);
                l_process_flag varchar2(20);
                v_msg          varchar2(100);
                cursor l_cursor is
                        select distinct wf_item_type, wf_item_key,
                                        cf_process_flag
                        from   cf_po_interface_b
                        where  org_id = l_org_id --lawrence
                        and    cf_process_flag in ('APPROVE', 'REJECT')
                        and    cf_process_msg is null; --where status in approve or reject 
        begin
                open l_cursor;
                loop
                        l_process_flag := '';
                        fetch l_cursor
                                into v_item_type, v_item_key, l_process_flag;
                        exit when l_cursor%notfound;
                        --        savepoint begin_tran;
                        if upper(l_process_flag) = 'APPROVE' then
                                po_reqapproval_action.approve_doc(v_item_type,
                                                                  v_item_key,
                                                                  null,
                                                                  'RUN',
                                                                  v_msg);
                                update cf_po_interface_b
                                set    cf_process_msg = v_msg,
                                       last_update_date = sysdate
                                where  wf_item_type = v_item_type
                                and    wf_item_key = v_item_key
                                and    org_id = l_org_id;
                                commit;
                        end if;
                        if upper(l_process_flag) = 'REJECT' then
                                po_reqapproval_action.reject_doc(v_item_type,
                                                                 v_item_key,
                                                                 null,
                                                                 'RUN',
                                                                 v_msg);
                                update cf_po_interface_b
                                set    cf_process_msg = v_msg,
                                       last_update_date = sysdate
                                where  wf_item_type = v_item_type
                                and    wf_item_key = v_item_key
                                and    org_id = l_org_id;
                                commit;
                        end if;
                end loop;
                close l_cursor;
        exception
                when others then
                        l_return := send_mail_to_root(p_body    => get_err_html(p_app    => 'approve_or_reject_po',
                                                                                p_status => 'Error',
                                                                                p_err    => sqlerrm),
                                                      p_subject => 'About Function Error');
                        rollback /*to begin_tran*/
                        ;
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end approve_or_reject_po;

        procedure import_pr_iface_all(errbuff out varchar2,
                                      retcode out varchar2) is
        begin
                import_pr_iface_all;
                submit_reqimport;
        end import_pr_iface_all;

        procedure import_pr_iface_all is
                af_iface_rec cf_af_requisitions_interface%rowtype;
                l_iface_rec  po_requisitions_interface_all%rowtype;
                l_header_no  varchar2(20);
                l_line_no    varchar2(150);
                --84=KPPC ;83=EKAY 
                cursor l_cursor is
                        select *
                        from   cf_af_requisitions_interface
                        where  org_id = l_org_id --lawrence  
                        and    nvl(cf_process_flag1,
                                   'N') = 'N';
        begin
                savepoint start_trans;
                begin
                        open l_cursor;
                        loop
                                fetch l_cursor
                                        into af_iface_rec;
                                exit when l_cursor%notfound;
                                l_iface_rec.last_update_date     := af_iface_rec.last_update_date;
                                l_iface_rec.last_updated_by      := af_iface_rec.last_updated_by;
                                l_iface_rec.creation_date        := af_iface_rec.creation_date;
                                l_iface_rec.created_by           := af_iface_rec.created_by;
                                l_iface_rec.last_update_login    := af_iface_rec.last_update_login;
                                l_iface_rec.org_id               := af_iface_rec.org_id;
                                l_iface_rec.req_number_segment1  := af_iface_rec.req_number_segment1;
                                l_iface_rec.authorization_status := 'INCOMPLETE';
                                l_iface_rec.autosource_flag      := 'N';
                                l_iface_rec.rfq_required_flag    := null;
                                if af_iface_rec.item_id is not null then
                                        l_iface_rec.destination_type_code := 'INVENTORY';
                                        l_iface_rec.requisition_type      := 'PURCHASE';
                                        l_iface_rec.source_type_code      := null;
                                        l_iface_rec.item_id               := af_iface_rec.item_id;
                                        l_iface_rec.item_description      := null;
                                        l_iface_rec.category_id           := null;
                                else
                                        l_iface_rec.destination_type_code := 'EXPENSE';
                                        l_iface_rec.requisition_type      := null;
                                        l_iface_rec.source_type_code      := 'VENDOR';
                                        l_iface_rec.item_id               := null;
                                        l_iface_rec.item_description      := af_iface_rec.item_description;
                                        if l_org_id = 84 then
                                                l_iface_rec.category_id := nvl(af_iface_rec.category_id,
                                                                               146); --146=未分類  
                                        end if;
                                        if l_org_id = 83 then
                                                l_iface_rec.category_id := nvl(af_iface_rec.category_id,
                                                                               144); --144=未分類  
                                        end if;
                                end if;
                                l_iface_rec.line_type_id        := af_iface_rec.line_type_id;
                                l_iface_rec.preparer_id         := get_requestor_id(af_iface_rec.preparer_name);
                                l_iface_rec.preparer_name       := af_iface_rec.preparer_name;
                                l_iface_rec.quantity            := af_iface_rec.quantity;
                                l_iface_rec.unit_of_measure     := upper(af_iface_rec.unit_of_measure);
                                l_iface_rec.unit_price          := af_iface_rec.unit_price;
                                l_iface_rec.need_by_date        := af_iface_rec.need_by_date;
                                l_iface_rec.currency_code       := af_iface_rec.currency_code;
                                l_iface_rec.currency_unit_price := af_iface_rec.currency_unit_price;
                                l_iface_rec.rate                := af_iface_rec.rate;
                                l_iface_rec.rate_date           := af_iface_rec.rate_date;
                                l_iface_rec.rate_type           := af_iface_rec.rate_type;
                                if l_org_id = 84 then
                                        l_iface_rec.destination_organization_id := 86;
                                end if;
                                if l_org_id = 83 then
                                        l_iface_rec.destination_organization_id := 85;
                                end if;
                                --  l_iface_rec.destination_subinventory    := af_iface_rec.destination_subinventory;
                                l_iface_rec.deliver_to_location_id  := af_iface_rec.deliver_to_location_id;
                                l_iface_rec.deliver_to_requestor_id := af_iface_rec.deliver_to_requestor_id;
                                l_iface_rec.charge_account_id       := af_iface_rec.charge_account_id;
                                --  l_iface_rec.accrual_account_id          := af_iface_rec.accrual_account_id;
                                --  l_iface_rec.multi_distributions         := af_iface_rec.multi_distributions;
                                l_iface_rec.interface_source_code := 'AgentFlow';
                                l_iface_rec.batch_id              := null;
                                l_iface_rec.line_attribute1       := af_iface_rec.line_attribute1;
                                l_iface_rec.header_description    := af_iface_rec.header_description;
                                --  l_iface_rec.oke_contract_num            := af_iface_rec.oke_contract_num;
                                -- l_iface_rec.note_to_buyer               := af_iface_rec.note_to_buyer;
                                --  l_iface_rec.note_to_receiver    := af_iface_rec.note_to_receiver;
                                --   l_iface_rec.suggested_vendor_id := af_iface_rec.suggested_vendor_id;
                                l_iface_rec.suggested_buyer_name      := af_iface_rec.suggested_buyer_name;
                                l_iface_rec.suggested_buyer_id        := af_iface_rec.suggested_buyer_id;
                                l_iface_rec.deliver_to_requestor_id   := get_requestor_id(af_iface_rec.deliver_to_requestor_name);
                                l_iface_rec.deliver_to_requestor_name := af_iface_rec.deliver_to_requestor_name;
                                if l_org_id = 84 then
                                        l_iface_rec.deliver_to_location_id := get_deliver_to_location_id('PPC4');
                                end if;
                                if l_org_id = 83 then
                                        l_iface_rec.deliver_to_location_id := get_deliver_to_location_id('EK1');
                                end if;
                                l_iface_rec.deliver_to_location_code := af_iface_rec.deliver_to_location_code;
                                insert into po_requisitions_interface_all
                                values l_iface_rec;
                                l_header_no := af_iface_rec.req_number_segment1;
                                l_line_no   := af_iface_rec.line_attribute1;
                                /*    dbms_output.put_line('l_header_no-->' ||
                                l_header_no || '  ' ||
                                'l_line_no-->' ||
                                l_line_no);*/
                        end loop;
                        close l_cursor;
                        update cf_af_requisitions_interface af
                        set    af.cf_process_flag1 = 'Y'
                        where  org_id = l_org_id --lawrence  
                        and    nvl(cf_process_flag1,
                                   'N') = 'N';
                exception
                        when others then
                                rollback to start_trans;
                                raise_application_error(-20001,
                                                        substr(sqlerrm,
                                                               1,
                                                               1000));
                end;
                commit;
        end import_pr_iface_all;

        function validate_agents(p_agent_id in number) return number is
                result number;
        begin
                select p_agent_id --？？？？？？？Melody ？agent id =2632？？  其他 む坻
                into   result
                from   dual
                where  exists (select he.last_name, he.first_name,
                               pa.agent_id, he.employee_number
                        from   po_agents pa, per_people_v7 he
                        where  pa.agent_id = he.person_id
                        and    trunc(sysdate) between
                               trunc(pa.start_date_active) and
                               trunc(nvl(pa.end_date_active,
                                         sysdate))
                        and    trunc(sysdate) between
                               trunc(nvl(he.hire_date,
                                          sysdate)) and
                               trunc(nvl(he.d_termination_date,
                                         sysdate))
                        and    pa.agent_id = p_agent_id);
                if result is null then
                        result := 2632;
                end if;
                return result;
        exception
                when others then
                        return 2632;
        end validate_agents;

        function validate_preparer_id(p_employee_num in varchar2) return varchar2 is
                result varchar2(1);
        begin
                select 'Y'
                into   result
                from   dual
                where  exists (select fu.user_name
                        from   fnd_user fu
                        where  trunc(sysdate) between
                               trunc(nvl(fu.start_date,
                                         sysdate)) and
                               trunc(nvl(fu.end_date,
                                         sysdate))
                        and    fu.user_name = p_employee_num);
                if result is null then
                        result := 'N';
                end if;
                return result;
        exception
                when others then
                        return 'N';
        end validate_preparer_id;

        function get_preparer_id(p_employee_num in varchar2) return number is
                result number;
        begin
                select fu.user_id
                into   result
                from   fnd_user fu
                where  trunc(sysdate) between
                       trunc(nvl(fu.start_date,
                                 sysdate)) and
                       trunc(nvl(fu.end_date,
                                 sysdate))
                and    fu.user_name = upper(p_employee_num);
                return result;
        exception
                when others then
                        raise_application_error(-20001,
                                                'ERP？？？？Buyer,？？？？');
        end get_preparer_id;

        function validate_requestor_id(p_employee_num in varchar2) return varchar2 is
                result varchar2(1);
        begin
                begin
                        mo_global.set_policy_context('S',
                                                     fnd_profile.value('ORG_ID'));
                end;
                select 'Y'
                into   result
                from   dual
                where  exists (select employee_num
                        from   hr_employees_current_v
                        where  employee_num = p_employee_num);
                if result is null then
                        result := 'N';
                end if;
                return result;
        exception
                when others then
                        return 'N';
        end validate_requestor_id;

        function get_requestor_id(p_employee_num in varchar2) return number is
                result number;
        begin
                begin
                        mo_global.set_policy_context('S',
                                                     fnd_profile.value('ORG_ID'));
                end;
                select employee_id
                into   result
                from   hr_employees_current_v
                where  employee_num = upper(p_employee_num);
                return result;
        exception
                when others then
                        raise_application_error(-20001,
                                                'ERP？？？？？？,？？？？');
        end get_requestor_id;

        function get_deliver_to_location_id(p_location_code in varchar2)
                return number is
                result number;
        begin
                select lot.location_id
                into   result
                from   hr_locations_all loc, hr_locations_all_tl lot
                where  nvl(loc.business_group_id,
                           nvl(hr_general.get_business_group_id,
                               -99)) = nvl(hr_general.get_business_group_id,
                                           -99)
                and    loc.location_id = lot.location_id
                and    lot.language = userenv('LANG')
                and    sysdate < nvl(loc.inactive_date,
                                     sysdate + 1)
                and    lot.location_code = upper(p_location_code);
                return result;
        exception
                when others then
                        raise_application_error(-20001,
                                                'ERP？？？？deliver_to_location_id,？？？？');
        end get_deliver_to_location_id;

        function validate_uom(p_uom in varchar2) return varchar2 is
                result varchar2(1);
        begin
                begin
                        mo_global.set_policy_context('S',
                                                     fnd_profile.value('ORG_ID'));
                end;
                select 'Y'
                into   result
                from   dual
                where  exists
                 (select unit_of_measure
                        from   (select muom.unit_of_measure_tl, muom.uom_class,
                                        muom.unit_of_measure, muom.uom_code
                                 from   (select rowid row_id, unit_of_measure,
                                                 uom_code, uom_class,
                                                 base_uom_flag,
                                                 unit_of_measure_tl,
                                                 last_update_date,
                                                 last_updated_by, creation_date,
                                                 created_by, last_update_login,
                                                 disable_date, description,
                                                 attribute_category, attribute1,
                                                 attribute2, attribute3,
                                                 attribute4, attribute5,
                                                 attribute6, attribute7,
                                                 attribute8, attribute9,
                                                 attribute10, attribute11,
                                                 attribute12, attribute13,
                                                 attribute14, attribute15,
                                                 request_id,
                                                 program_application_id,
                                                 program_id, program_update_date,
                                                 language, source_lang
                                          from   mtl_units_of_measure_tl) muom,
                                        mtl_uom_conversions muc
                                 where  nvl(muom.disable_date,
                                            sysdate + 1) > sysdate
                                 and    muc.uom_code = muom.uom_code
                                 and    muc.inventory_item_id = 0)
                        where  upper(unit_of_measure) = upper(p_uom));
                if result is null then
                        result := 'N';
                end if;
                return result;
        exception
                when others then
                        return 'N';
        end validate_uom;

        function get_last_five_po_html(p_inventory_item_id in number)
                return varchar2 is
                result varchar2(32767);
                cursor l_cursor is
                        select *
                        from   (select po.po_num, po.line_num, po.item,
                                        po.item_description, po.quantity,
                                        po.uom, po.price_override,
                                        po.currency_code, po.rate,
                                        po.quantity * po.price_override *
                                         po.rate amount_twd, po.vendor_name,
                                        po.creation_date, po.inventory_item_id
                                 from   cfpor001_v_1 po
                                 where  po.inventory_item_id =
                                        p_inventory_item_id
                                 order  by po.creation_date desc)
                        where  rownum <= 5;
                l_row l_cursor%rowtype;
        begin
                result := '<table><tr><th>PO_NUM</th><th>LINE_NUM</th>
        <th>ITEM</th><th>DESCRIPTION</th><th>QUANTITY</th>
        <th>UOM</th><th>UNIT_PRICE</th><th>CURRENCY</th><th>CURRENCY_RATE</th>
        <th>AMOUNT_TWD</th><th>VENDOR_NAME</th></tr>';
                open l_cursor;
                loop
                        fetch l_cursor
                                into l_row;
                        exit when l_cursor%notfound;
                        result := result || '<tr><td>' || l_row.po_num ||
                                  '</td><td>' || l_row.line_num ||
                                  '</td><td>' || l_row.item || '</td><td>' ||
                                  l_row.item_description || '</td><td>' ||
                                  l_row.quantity || '</td><td>' ||
                                  l_row.uom || '</td><td>' ||
                                  l_row.price_override || '</td><td>' ||
                                  l_row.currency_code || '</td><td>' ||
                                  l_row.rate || '</td><td>' ||
                                  l_row.amount_twd || '</td><td>' ||
                                  l_row.vendor_name || '</td></tr>';
                end loop;
                close l_cursor;
                result := result || '</table>';
                return(result);
        exception
                when no_data_found then
                        return null;
                when others then
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_last_five_po_html;

        function get_last_3_po_date(p_inventory_item_id in number,
                                    p_num in number,
                                    p_org_id in number default 84) return date is
                result date;
        begin
                select order_date
                into   result
                from   (select po.*, rownum num
                         from   (select t.order_date, t.vendor_name, t.quantity,
                                         t.unit_price
                                  from   cf_po_all_v t
                                  where  t.authorization_status = 'APPROVED'
                                  and    t.org_id = p_org_id
                                  and    t.item_id = p_inventory_item_id
                                  order  by t.order_date desc) po
                         where  rownum <= 3)
                where  num = p_num;
                return result;
        exception
                when no_data_found then
                        return null;
                when others then
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_last_3_po_date;

        function get_last_3_po_vendor(p_inventory_item_id in number,
                                      p_num in number,
                                      p_org_id in number default 84) --lawrence
         return varchar2 is
                result varchar2(240);
        begin
                select vendor_name
                into   result
                from   (select po.*, rownum num
                         from   (select t.order_date, t.vendor_name, t.quantity,
                                         t.unit_price
                                  from   cf_po_all_v t
                                  where  t.authorization_status = 'APPROVED'
                                  and    t.org_id = p_org_id
                                  and    t.item_id = p_inventory_item_id
                                  order  by t.order_date desc) po
                         where  rownum <= 3)
                where  num = p_num;
                return result;
        exception
                when no_data_found then
                        return null;
                when others then
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_last_3_po_vendor;

        function get_last_3_po_qty(p_inventory_item_id in number,
                                   p_num in number,
                                   p_org_id in number default 84) return number is
                --lawrence 
                result number;
        begin
                select quantity
                into   result
                from   (select po.*, rownum num
                         from   (select t.order_date, t.vendor_name, t.quantity,
                                         t.unit_price
                                  from   cf_po_all_v t
                                  where  t.authorization_status = 'APPROVED'
                                  and    t.org_id = p_org_id
                                  and    t.item_id = p_inventory_item_id
                                  order  by t.order_date desc) po
                         where  rownum <= 3)
                where  num = p_num;
                return nvl(result,
                           0);
        exception
                when no_data_found then
                        return 0;
                when others then
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_last_3_po_qty;

        function get_last_3_po_price(p_inventory_item_id in number,
                                     p_num in number,
                                     p_org_id in number default 84) return number is
                --lawrence
                result number;
        begin
                select unit_price
                into   result
                from   (select po.*, rownum num
                         from   (select t.order_date, t.vendor_name, t.quantity,
                                         t.unit_price
                                  from   cf_po_all_v t
                                  where  t.authorization_status = 'APPROVED'
                                  and    t.org_id = p_org_id
                                  and    t.item_id = p_inventory_item_id
                                  order  by t.order_date desc) po
                         where  rownum <= 3)
                where  num = p_num;
                return nvl(result,
                           0);
        exception
                when no_data_found then
                        return 0;
                when others then
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_last_3_po_price;

        function get_qty_last_3_month_html(p_inventory_item_id in number)
                return varchar2 is
                result varchar2(32767);
                cursor l_cursor is
                        select sum(primary_quantity) sum_quantity,
                               transaction_uom, yyyymm,
                               transaction_type_name
                        from   (select mmt.transaction_id,
                                        mmt.primary_quantity,
                                        mmt.transaction_uom,
                                        mtt.transaction_type_name,
                                        mmt.transaction_date,
                                        mmt.inventory_item_id,
                                        mmt.transaction_type_id,
                                        to_char(mmt.transaction_date,
                                                 'yyyy/mm') yyyymm
                                 from   mtl_material_transactions mmt,
                                        mtl_transaction_types mtt
                                 /*  ,(select * from mtl_system_items_b a where a.organization_id=86) msi*/
                                 where  mmt.transaction_type_id =
                                        mtt.transaction_type_id
                                       /* and mmt.inventory_item_id=msi.inventory_item_id*/
                                 and    mmt.transaction_type_id = 18
                                 and    to_char(mmt.transaction_date,
                                                'yyyy/mm') >
                                        to_char(add_months(sysdate,
                                                            -3),
                                                 'yyyy/mm')
                                 and    mmt.inventory_item_id =
                                        p_inventory_item_id)
                        group  by transaction_uom, yyyymm,
                                  transaction_type_name;
                l_row l_cursor%rowtype;
        begin
                result := '<table><tr><th>sum_quantity</th><th>transaction_uom</th>
        <th>yyyymm</th><th>transaction_type</th></tr>';
                open l_cursor;
                loop
                        fetch l_cursor
                                into l_row;
                        exit when l_cursor%notfound;
                        result := result || '<tr><td>' ||
                                  l_row.sum_quantity || '</td><td>' ||
                                  l_row.transaction_uom || '</td><td>' ||
                                  l_row.yyyymm || '</td><td>' ||
                                  l_row.transaction_type_name ||
                                  '</td></tr>';
                end loop;
                close l_cursor;
                result := result || '</table>';
                return(result);
        exception
                when no_data_found then
                        return null;
                when others then
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_qty_last_3_month_html;

        function get_qty_last_3_month(p_inventory_item_id in number,
                                      p_yyyymm in varchar2) return number is
                result number;
        begin
                select sum(primary_quantity)
                into   result
                from   (select mmt.transaction_id, mmt.primary_quantity,
                                mmt.transaction_uom, mtt.transaction_type_name,
                                mmt.transaction_date, mmt.inventory_item_id,
                                mmt.transaction_type_id,
                                to_char(mmt.transaction_date,
                                         'yyyymm') yyyymm
                         from   mtl_material_transactions mmt,
                                mtl_transaction_types mtt
                         /*  ,(select * from mtl_system_items_b a where a.organization_id=86) msi*/
                         where  mmt.transaction_type_id =
                                mtt.transaction_type_id
                               /* and mmt.inventory_item_id=msi.inventory_item_id*/
                         and    mmt.transaction_type_id = 18
                         and    to_char(mmt.transaction_date,
                                        'yyyymm') = p_yyyymm
                         and    mmt.inventory_item_id = p_inventory_item_id
                         and    mmt.organization_id = 86);
                return nvl(result,
                           0);
        exception
                when no_data_found then
                        return 0;
                when others then
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_qty_last_3_month;

        function get_po_history_price(p_description in varchar2) return varchar2 is
                result varchar2(32767);
                cursor l_cursor is
                        select *
                        from   (select po.po_num, po.line_num, po.item,
                                        po.item_description, po.quantity,
                                        po.uom, po.price_override,
                                        po.currency_code, po.rate,
                                        po.quantity * po.price_override *
                                         po.rate amount_twd, po.vendor_name,
                                        po.creation_date, po.inventory_item_id
                                 from   cfpor001_v_1 po
                                 where  po.item_description like
                                        '%' || p_description || '%'
                                 and    po.item is null
                                 order  by po.creation_date desc)
                        where  rownum <= 5;
                l_row l_cursor%rowtype;
        begin
                result := '<table><tr><th>PO_NUM</th><th>LINE_NUM</th>
        <th>ITEM</th><th>DESCRIPTION</th><th>QUANTITY</th>
        <th>UOM</th><th>UNIT_PRICE</th><th>CURRENCY</th><th>CURRENCY_RATE</th>
        <th>AMOUNT_TWD</th><th>VENDOR_NAME</th></tr>';
                open l_cursor;
                loop
                        fetch l_cursor
                                into l_row;
                        exit when l_cursor%notfound;
                        result := result || '<tr><td>' || l_row.po_num ||
                                  '</td><td>' || l_row.line_num ||
                                  '</td><td>' || l_row.item || '</td><td>' ||
                                  l_row.item_description || '</td><td>' ||
                                  l_row.quantity || '</td><td>' ||
                                  l_row.uom || '</td><td>' ||
                                  l_row.price_override || '</td><td>' ||
                                  l_row.currency_code || '</td><td>' ||
                                  l_row.rate || '</td><td>' ||
                                  l_row.amount_twd || '</td><td>' ||
                                  l_row.vendor_name || '</td></tr>';
                end loop;
                close l_cursor;
                result := result || '</table>';
                return(result);
        exception
                when no_data_found then
                        return null;
                when others then
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_po_history_price;

        procedure get_vendor_list(p_vendor in out cf_cv_type.po_type) is
        begin
                open p_vendor for
                        select pv.vendor_id, pv.vendor_name
                        from   po_vendors pv
                        where  to_char(sysdate,
                                       'yyyy/mm/dd') between
                               to_char(pv.start_date_active,
                                       'yyyy/mm/dd') and
                               to_char(nvl(pv.end_date_active,
                                           sysdate),
                                       'yyyy/mm/dd');
        end get_vendor_list;

        function get_qty_last_mm_issued(p_item_id in number,
                                        p_organization_id in number default 86)
                return number is
                result number;
        begin
                if l_org_id = 83 then
                        --？？？？
                        select sum(mmt.transaction_quantity)
                        into   result
                        from   mtl_material_transactions mmt,
                               mtl_transaction_types mtt,
                               mtl_system_items_b msi, mfg_lookups ml
                        where  to_char(mmt.transaction_date,
                                       'yyyymm') =
                               to_char(add_months(sysdate,
                                                  -1),
                                       'yyyymm')
                        and    mmt.transaction_type_id =
                               mtt.transaction_type_id
                        and    mmt.inventory_item_id =
                               msi.inventory_item_id
                        and    msi.organization_id = mmt.organization_id
                        and    ml.lookup_type = 'MTL_TRANSACTION_ACTION'
                        and    ml.lookup_code = mmt.transaction_action_id
                        and    mmt.transaction_type_id in
                               (101,
                                 106,
                                 32,
                                 33,
                                 35,
                                 105,
                                 116,
                                 43 --, 44,17
                                 )
                              --101,？？？？          100  298  
                              --106,？？？？？？      121   
                              --32, Miscellaneous issue     32  
                              --33,Sales order issue      33  
                              --35,WIP component issue    35  
                              --105,？？？？？？        126  
                              --116,？？？？          358  130  
                              --43  WIP Component Return    43                                   
                        and    msi.item_type <> '？？？？'
                        and    mmt.inventory_item_id = p_item_id
                        and    mmt.organization_id = p_organization_id;
                end if;
                if l_org_id = 84 then
                        select sum(mmt.transaction_quantity)
                        into   result
                        from   mtl_material_transactions mmt,
                               mtl_transaction_types mtt,
                               mtl_system_items_b msi, mfg_lookups ml
                        where  to_char(mmt.transaction_date,
                                       'yyyymm') =
                               to_char(add_months(sysdate,
                                                  -1),
                                       'yyyymm')
                        and    mmt.transaction_type_id =
                               mtt.transaction_type_id
                        and    mmt.inventory_item_id =
                               msi.inventory_item_id
                        and    msi.organization_id = mmt.organization_id
                        and    ml.lookup_type = 'MTL_TRANSACTION_ACTION'
                        and    ml.lookup_code = mmt.transaction_action_id
                        and    mmt.transaction_type_id in
                               (100,
                                 298,
                                 121,
                                 32,
                                 33,
                                 35,
                                 126,
                                 358,
                                 130,
                                 43)
                              --101,？？？？          100  298  
                              --106,？？？？？？      121   
                              --32, Miscellaneous issue     32  
                              --33,Sales order issue      33  
                              --35,WIP component issue    35  
                              --105,？？？？？？        126  
                              --116,？？？？          358  130  
                              --43  WIP Component Return    43  
                        and    msi.item_type <> '？？？？'
                        and    mmt.inventory_item_id = p_item_id
                        and    mmt.organization_id = p_organization_id;
                end if;
                return result;
        exception
                when no_data_found then
                        return null;
                when others then
                        l_return := send_mail_to_root(p_body    => get_err_html(p_app    => 'get_qty_last_mm_issued',
                                                                                p_status => 'Error',
                                                                                p_err    => sqlerrm),
                                                      p_subject => 'About Function Error');
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_qty_last_mm_issued;

        function get_mrp_qty(p_item_id in number, p_mm in varchar2) return number is
                result   number;
                l_yyyymm varchar2(6);
        begin
                if p_mm = '0' then
                        l_yyyymm := to_char(sysdate,
                                            'yyyymm');
                elsif p_mm = '1' then
                        l_yyyymm := to_char(add_months(sysdate,
                                                       1),
                                            'yyyymm');
                elsif p_mm = '2' then
                        l_yyyymm := to_char(add_months(sysdate,
                                                       2),
                                            'yyyymm');
                else
                        l_yyyymm := null;
                end if;
                select /* sum(mos.quantity_rate * cf_item_uom_convert_to_kg(mos.inventory_item_id, 86))*/
                 sum(mos.quantity_rate)
                into   result
                from   mrp_orders_sc_v mos, mtl_system_items_b msi
                where  mos.inventory_item_id = msi.inventory_item_id
                and    msi.organization_id = mos.organization_id
                and    mos.compile_designator =
                       (select max(compile_designator)
                         from   mrp_designators
                         where  (compile_designator like
                                'MRP-' || to_char(sysdate,
                                                   'yymm') || '%')
                         or     (compile_designator like
                               'MRP-' || to_char(add_months(sysdate,
                                                              -1),
                                                   'yymm') || '%'))
                and    mos.order_type_text = 'Planned order'
                      --supply  5& demand 7 1
                      --7=Forecast MDS;5=Planned order;1=Planned order demand
                and    msi.item_type <> '？？？？'
                and    mos.inventory_item_id = p_item_id
                and    to_char(mos.new_due_date,
                               'yyyymm') = l_yyyymm;
                return result;
        exception
                when no_data_found then
                        return null;
                when others then
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_mrp_qty;

        function get_qty_on_way(p_item_id in number,
                                p_org_id in number default 84) return number is
                --lawrence  
                result number;
        begin
                begin
                        mo_global.set_policy_context('S',
                                                     fnd_profile.value('ORG_ID'));
                end;
                select /*sum((quantity - quantity_cancelled - quantity_received) *  cf_item_uom_convert_to_kg(item_id, 86))*/
                 sum(quantity - quantity_cancelled - quantity_received)
                into   result
                from   po_line_locations_inq_v
                where  nvl(cancel_flag,
                           'N') = 'N'
                and    shipment_type in ('STANDARD',
                                         'PLANNED')
                and    authorization_status = 'APPROVED'
                and    quantity - quantity_cancelled - quantity_received <> 0
                and    item_id = p_item_id
                and    org_id = p_org_id;
                return result;
        exception
                when no_data_found then
                        return null;
                when others then
                        l_return := send_mail_to_root(p_body    => get_err_html(p_app    => 'get_qty_on_way',
                                                                                p_status => 'Error',
                                                                                p_err    => sqlerrm),
                                                      p_subject => 'About Function Error');
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_qty_on_way;

        function get_qty_on_hand(p_item_id in number,
                                 p_organization_id in number default 86)
                return number is
                result number;
        begin
                select /*sum(primary_transaction_quantity * cf_item_uom_convert_to_kg(inventory_item_id,  organization_id))*/
                 sum(primary_transaction_quantity)
                into   result
                from   mtl_onhand_quantities_detail
                where  inventory_item_id = p_item_id
                and    organization_id = p_organization_id;
                return result;
        exception
                when no_data_found then
                        return null;
                when others then
                        l_return := send_mail_to_root(p_body    => get_err_html(p_app    => 'get_qty_on_hand',
                                                                                p_status => 'Error',
                                                                                p_err    => sqlerrm),
                                                      p_subject => 'About Function Error');
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_qty_on_hand;

        function get_cfmrpr002(p_mrp_name in varchar2) return varchar2 is
                result   varchar2(32767);
                l_cursor cf_cv_type.sys_type;
                l_a1     varchar2(40);
                l_a2     number;
                l_a3     varchar2(10);
        begin
                begin
                        cfmrpr002(cf_mrp     => l_cursor,
                                  p_mrp_name => p_mrp_name);
                end;
                result := '<table>';
                loop
                        fetch l_cursor
                                into l_a1, l_a2, l_a3;
                        exit when l_cursor%notfound;
                        result := result || '<tr><td>' || l_a1 ||
                                  '</td><td>' || to_char(l_a2) ||
                                  '</td><td>' || l_a3 || '</td></tr>';
                end loop;
                close l_cursor;
                result := result || '</table>';
                return(result);
        exception
                when others then
                        return null;
        end get_cfmrpr002;

        function get_po_num_via_pr(p_pr_segment1 in varchar2,
                                   p_pr_line_num in number) return varchar2 is
                result varchar2(100);
        begin
                select poh.segment1 || '-' || to_char(pol.line_num)
                into   result
                from   po_requisition_headers_all prh,
                       po_requisition_lines_all prl, po_headers_all poh,
                       po_lines_all pol, po_line_locations_all pll
                where  prh.requisition_header_id =
                       prl.requisition_header_id
                and    prh.org_id = prl.org_id
                and    poh.org_id = pol.org_id
                and    prh.org_id = l_org_id
                and    poh.po_header_id = pol.po_header_id
                and    poh.po_header_id = pll.po_header_id
                and    pol.po_line_id = pll.po_line_id
                and    pll.line_location_id = prl.line_location_id
                and    prh.segment1 = p_pr_segment1
                and    prl.line_num = p_pr_line_num;
                return result;
        exception
                when no_data_found then
                        return null;
                when others then
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_po_num_via_pr;

        function get_pr_num_via_po(p_po_segment1 in varchar2,
                                   p_po_line_num in number) return varchar2 is
                result varchar2(100);
        begin
                select prh.segment1 || '-' || to_char(prl.line_num)
                into   result
                from   po_requisition_headers_all prh,
                       po_requisition_lines_all prl, po_headers_all poh,
                       po_lines_all pol, po_line_locations_all pll
                where  prh.requisition_header_id =
                       prl.requisition_header_id
                and    prh.org_id = prl.org_id
                and    poh.org_id = pol.org_id
                and    prh.org_id = l_org_id
                and    poh.po_header_id = pol.po_header_id
                and    poh.po_header_id = pll.po_header_id
                and    pol.po_line_id = pll.po_line_id
                and    pll.line_location_id = prl.line_location_id
                and    poh.segment1 = p_po_segment1
                and    pol.line_num = p_po_line_num;
                return result;
        exception
                when no_data_found then
                        return null;
                when others then
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_pr_num_via_po;

        function get_pr_ansid(p_po_num_and_line in varchar2) return varchar2 is
                result nvarchar2(300);
        begin
                select t.cf_af_ansid
                into   result
                from   cf_af_requisitions_interface t
                where  t.org_id = l_org_id
                and    upper(t.req_number_segment1 || '-' ||
                             t.line_attribute1) = upper(p_po_num_and_line);
                return result;
        exception
                when no_data_found then
                        return null;
                when others then
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end get_pr_ansid;

        procedure submit_reqimport is
                l_request_id number;
                l_user_id    fnd_user.user_id%type;
        begin
                if l_org_id = 84 then
                        select user_id
                        into   l_user_id
                        from   fnd_user
                        where  upper(user_name) = 'AGENTFLOW';
                        fnd_global.apps_initialize(user_id      => l_user_id,
                                                   resp_id      => 50274,
                                                   resp_appl_id => 201);
                        --KPPC_BUYER_SUPER                                                     
                end if;
                if l_org_id = 83 then
                        select user_id
                        into   l_user_id
                        from   fnd_user
                        where  upper(user_name) = 'AGENTFLOW';
                        fnd_global.apps_initialize(user_id      => l_user_id,
                                                   resp_id      => 50217,
                                                   resp_appl_id => 201);
                        --EKAY_BUYER_SUPER                                                     
                end if;
                /*                fnd_global.apps_initialize(fnd_profile.value('USER_ID'),
                fnd_profile.value('RESP_ID'),
                fnd_profile.value('RESP_APPL_ID'),
                null, null);*/
                l_request_id := apps.fnd_request.submit_request(application => 'PO',
                                                                program     => 'REQIMPORT',
                                                                argument1   => '',
                                                                argument2   => '',
                                                                argument3   => 'ALL',
                                                                argument4   => '',
                                                                argument5   => 'N',
                                                                argument6   => 'N');
                commit;
                dbms_output.put_line(l_request_id);
        exception
                when others then
                        l_return := send_mail_to_root(p_body    => get_err_html(p_app    => 'submit_reqimport',
                                                                                p_status => 'Error',
                                                                                p_err    => sqlerrm),
                                                      p_subject => 'About Function Error');
                        raise_application_error(-20001,
                                                substr(sqlerrm,
                                                       1,
                                                       100));
        end submit_reqimport;

        function get_gl_rate(f_currency_code in varchar2,
                             f_conversion_date in date) return number is
                result            number;
                l_conversion_type gl_daily_rates.conversion_type%type;
        begin
                if l_org_id = 84 then
                        l_conversion_type := '1000';
                end if;
                if l_org_id = 83 then
                        l_conversion_type := '1004';
                end if;
                begin
                        select conversion_rate
                        into   result
                        from   gl_daily_rates
                        where  conversion_type = l_conversion_type
                        and    from_currency = f_currency_code
                        and    to_currency = 'TWD'
                        and    conversion_date = f_conversion_date;
                exception
                        when others then
                                result := 1;
                end;
                return result;
        end get_gl_rate;

        function get_po_cf_total_sum(p_org_id in number,
                                     p_po_number in varchar2) return number is
                l_cf_total number;
        begin
                begin
                        select sum(t.cf_amount)
                        into   l_cf_total
                        from   cf_po_interface_v t
                        where  t.org_id = p_org_id
                        and    t.po_number = p_po_number;
                exception
                        when others then
                                return 0;
                end;
                return l_cf_total;
        end get_po_cf_total_sum;

        function send_mail_to_root(p_body in varchar2,
                                   p_subject in varchar2) return number is
                root_mail nvarchar2(50) := 'lawrence.chen@ekay.com.tw';
                sender    nvarchar2(50) := 'AF@ekay.com.tw';
        begin
                send_email(txt        => p_body,
                           sender     => sender,
                           receiver   => root_mail,
                           subject    => p_subject,
                           mailserver => 'exchange2010.prosperchem.com');
                return 0;
        exception
                when others then
                        return 1;
        end send_mail_to_root;

        function get_host_name return varchar2 is
                result v$instance.host_name%type;
        begin
                select host_name into result from v$instance;
                return result;
        exception
                when others then
                        return null;
        end get_host_name;

        function get_err_html(p_app in varchar2, p_status in varchar2,
                              p_err in varchar2) return varchar2 is
                result varchar2(32767);
        begin
                result := '<html><body><table border="1" cellpadding=0 cellspacing=0 ><tr><th>Datetime</th><th>Host</th><th>Function</th><th>Status</th><th>ErrorMessage</th></tr><tr><td>' ||
                          to_char(sysdate,
                                  'yyyy/mm/dd hh:MM:ss') || '</td><td>' ||
                          get_host_name || '</td><td>' || p_app ||
                          '</td><td><font color=red>' || p_status ||
                          '</font></td><td>' || p_err ||
                          '</td></tr></table></body></html>';
                return result;
        end get_err_html;

end cf_agentflow_pkg;
/
