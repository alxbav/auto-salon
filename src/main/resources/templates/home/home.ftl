<#import  "../common/page.ftl" as common>
<@common.page>
    <h2> Свободные машины :</h2>
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

            <td><a class="btn btn-primary" href="redirect:/driverq_info.ftl" role="button"> Link </a></td>
        </tr>
    </table>

    <h2> Водители: </h2>
    <table class="table">
        <thead>
        <tr>
            <th> Driver ID</th>
            <th> Driver Firstname</th>
            <th> Driver Lastname</th>
            <th> Car N
                umber</th>
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

            <td><a class="btn btn-primary" href="redirect:/driverq_info.ftl" role="button"> Info </a></td>
        </tr>
    </table>
<h2> Потенциальные водители: </h2>
    <table class="table">
        <thead>
        <tr>

            <th> Driver Firstname</th>
            <th> Driver Lastname</th>
            <th> Phone</th>
            <th> Active</th>
            <th> Comments</th>
        </tr>
        </thead>
        <#list driverqpotencs as driverqPotencial>
            <tr>

                <td> ${driverqPotencial.firstName}</td>
                <td> ${driverqPotencial.lastName}</td>
                <td> ${driverqPotencial.phone}</td>
                <td> ${driverqPotencial.active1}</td>
                <td> ${driverqPotencial.comments}</td>

                <td><a class="btn btn-primary" href="redirect:/driverq_info.ftl" role="button"> Edit </a></td>
            </tr>



        </#list>

    </table>




</@common.page>