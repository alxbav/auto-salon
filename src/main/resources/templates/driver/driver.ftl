<#import "../common/page.ftl" as common>
<@common.page>
    <h2> Drivers : </h2>
    <table class="table">
        <thead>
        <tr>
            <th> ID</th>
            <th> Car</th>
            <th> Saldo</th>
            <th> Name</th>
            <th> Lastname</th>
            <th> Phone</th>
            <th> E-Mail</th>
            <th> Taxi License</th>
            <th> Driver License</th>

        </tr>
        </thead>
        <#list drivers as driver>
            <tr>
                <td> ${driver.id}</td>
                <td> ${driver.id}</td>
                <td> ${driver.id}</td>
                <td> ${driver.firstName}</td>
                <td> ${driver.lastName}</td>
                <td> ${driver.phone}</td>
                <td> ${driver.email}</td>
                <td> ${driver.taxiLicense}</td>
                <td> ${driver.driverLicenseNumber}</td>

                <td><a class="btn btn-primary" href="redirect:/driver-info.ftl" role="button"> Balance </a></td>
                <td><a class="btn btn-primary" href="driverq/driver-info.ftl" role="button"> Link </a></td>
                <td><a class="btn btn-primary" href="driverq/driver-info.ftl" role="button"> Info </a></td>
            </tr>
        </#list>
    </table>

</@common.page>