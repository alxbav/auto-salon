<#import "../common/page.ftl" as common>
<@common.page>
    <h2> Remont : </h2>
    <table class="table">
        <thead>
        <tr>
            <th> Manufactured</th>
            <th> Reg Number</th>
            <th> Fuel Type</th>
            <th> Date</th>

        </tr>
        </thead>
        <#list cars as car >
            <tr>
                <td> ${car.manufacturer}</td>
                <td> ${car.regNumber}</td>
                <td> ${car.fuelType}</td>
                <td> ${car.releaseDate}</td>


                <td><a class="btn btn-primary" href="car/sell?id=${car.id}" role="button"> Info </a></td>
            </tr>
        </#list>
    </table>

</@common.page>