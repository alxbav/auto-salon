<#import "../common/page.ftl" as common>
<@common.page>
    <h2> Drivers : </h2>
    <table class="table">
        <thead>
        <tr>
            <th> ID</th>
            <th> Name</th>
            <th> Lastname</th>
            <th> Phone</th>
            <th> E-Mail</th>
            <th> Taxi License</th>
            <th> Driver License</th>

        </tr>
        </thead>
        <#list drivers as driverq>
            <tr>
                <td> ${driverq.id}</td>
                <td> ${driverq.firstName}</td>
                <td> ${driverq.lastName}</td>
                <td> ${driverq.phone}</td>
                <td> ${driverq.email}</td>
                <td> ${driverq.taxiLicense}</td>
                <td> ${driverq.driverLicenseNumber}</td>

                <td><a class="btn btn-primary" href="car/sell?id=${driverq.id}" role="button"> Info </a></td>
            </tr>
        </#list>
    </table>

</@common.page>