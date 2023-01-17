<#import "../common/page.ftl" as common>
<@common.page>
    <h2> Balance : </h2>
    <table class="table">
        <thead>
        <tr>


            <th> Week </th>
            <th> Date</th>
            <th> Driver Id</th>
            <th> Summa</th>
            <th> Transaction Type</th>
            <th> Comment</th>

        </tr>
        </thead>

        <#list  balanceq as balanceq>
            <tr>


                <td> ${balanceq.week_number}</td>
                <td> ${balanceq.date}</td>
                <td> ${balanceq.driver_id}</td>
                <td> ${balanceq.summ}</td>
                <td> ${balanceq.transaction_type}</td>
                <td> ${balanceq.comments}</td>

                <td><a class="btn btn-primary" href="car/sell?id=${balanceq.id}" role="button"> Edit </a></td>
            </tr>



        </#list>


    </table>

</@common.page>