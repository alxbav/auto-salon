<#import "../common/page.ftl" as common>
<@common.page>
    <h2> NEW Car : </h2>
    <table class="table">
        <thead>
        <tr>


        </tr>
        </thead>

        <div class="container mt-5 mb-5">
            <form action="qrental_cars/carq-add.ftl" method="post">

                <td>
                    <div class="form-check form-switch">
                        <input class="form-check-input" type="checkbox" role="switch" name="active" id="active">
                        <label class="form-check-label" for="active"> Active </label>
                    </div>
                </td>
                <td>
                    <div class="form-check form-switch">
                        <input type="checkbox" role="switch" name="qRent" id="qRent" class="form-check-input">
                        <label class="form-check-label" for="qRent"> Rent </label>
                    </div>
                </td>
                <tr></tr>
                <td><input type="text" name="regNuber" placeholder="REG Number" class="form-control"></td>
                <td><input type="date" name="releaseDate" placeholder="Date Release" class="form-control"></td>
                <tr></tr>
                <td><input type="text" name="manufacturer" placeholder="manufacturer" class="form-control"></td>
                <td><input type="text" name="model" placeholder="model" class="form-control"></td>
                <tr></tr>
                <td><input type="checkbox" name="appropriation" placeholder="appropriation" class="form-check-inputl">
                </td>
                <td><input type="checkbox" name="elegance" placeholder="elegance" class="form-check-input"></td>
                <td><input type="text" name="gearType" placeholder="Gear Type" class="form-control"></td>
                <td><input type="text" name="fuelType" placeholder="Fuel Type" class="form-control"></td>
                <td><input type="checkbox" name="lpg" placeholder="lpg" class="form-check-input"></td>
                <td><input type="date" name="dateInstallLpg" placeholder="Date Install LPG" class="form-control"></td>
                <td><input type="text" name="insuranceFirm" placeholder="Insurance Firm" class="form-control"></td>
                <td><input type="date" name="insuranceEnd" placeholder="End Of Insurance" class="form-control"></td>
                <td><input type="checkbox" name="sCard" placeholder="sCard" class="form-check-input"></td>
                <td><input type="checkbox" name="key2" placeholder="key2" class="form-check-input"></td>
                <td><input type="checkbox" name="gps" placeholder="gps" class="form-check-input"></td>
                <td><input type="date" name="technicalInspectionEnd" placeholder="Date of expiry TO"
                           class="form-control"></td>
                <td><input type="date" name="gasInspectionEnd" placeholder="Date of expiry GAS TO" class="form-control">
                </td>
                <td><textarea name="comments" placeholder="Comments" class="form-control"></textarea></td>
                <br>


                <td>
                    <button type="submit" class="btn btn-success"> OK</button>
                </td>
            </form>
        </div>


    </table>

</@common.page>