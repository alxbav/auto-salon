<#import  "common/page.ftl" as common>
<@common.page>
    <h3> Q RENTAL GRUPP</h3>
    <table class="table">
        <thead>
        <tr>
            <th> Free cars</th>
            <th> From Date</th>
            <th> Rent price</th>
            <th> Fuel type</th>
        </tr>
        </thead>

        <tr>
            <td> Number</td>
            <td> date</td>
            <td> price</td>
            <td> fuel</td>

            <td><a class="btn btn-primary" href="redirect:/driverq_info.ftl" role="button"> ????? </a></td>
        </tr>
    </table>


    <table class="table">
        <thead>
        <tr>
            <th> Driver ID</th>
            <th> Driver Firstname</th>
            <th> Driver Lastname</th>
            <th> Car NNumber</th>
            <th> Balance</th>
            <th> Phone</th>
        </tr>
        </thead>

        <tr>
            <td> id</td>
            <td> Name</td>
            <td> Lastname</td>
            <td> Number</td>
            <td> Balance</td>
            <td> Phone</td>

            <td><a class="btn btn-primary" href="redirect:/driverq_info.ftl" role="button"> ????? </a></td>
        </tr>
    </table>

    <table class="table">
        <thead>
        <tr>

            <th> Driver Firstname</th>
            <th> Driver Lastname</th>
            <th> Phone</th>
            <th> Active</th>
            <th><a class="btn btn-primary" href="redirect:/driverq_info.ftl" role="button"> New </a></th>

        </tr>
        </thead>

        <#list driverqpotencs as driverPotencial>
            <tr>

                <td> ${driverPotencial.firsName}</td>
                <td> ${driverPotencial.LastName}</td>
                <td> ${driverPotencial.phone}</td>
                <td> ${driverPotencial.active}</td>

                <td><a class="btn btn-primary" href="redirect:/driverq_info.ftl" role="button"> Edit </a></td>
                <td><a class="btn btn-primary" href="redirect:/driverq_info.ftl" role="button"> Delete </a></td>
            </tr>



        </#list>

    </table>




</@common.page>