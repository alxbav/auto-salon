<#import "../common/page.ftl" as common>
<@common.page>
    <h2> Rental cars : </h2>
    <table class="table">
        <thead>
        <tr>
            <th> Reg Number</th>
            <th> Manufactured</th>
            <th> Release Date</th>
            <th> Gear Type</th>
            <th> Fuel Type</th>
            <th> Rent Type</th>


        </tr>
        </thead>
        <#list cars as carq>
            <tr>
                <td> ${carq.regNumber}</td>
                <td> ${carq.manufacturer}</td>
                <td> ${carq.releaseDate}</td>
                <td> ${carq.gearType}</td>
                <td> ${carq.fuelType}</td>
                <td> ${carq.rentType}</td>


                <td><a class="btn btn-primary" href="car/sell?id=${carq.id}" role="button"> Info </a></td>
            </tr>
        </#list>
    </table>

</@common.page>