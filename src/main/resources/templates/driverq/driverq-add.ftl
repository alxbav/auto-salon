<#import "../common/page.ftl" as common>
<@common.page>
    <h2> NEW Driver : </h2>
    <table class="table">
        <thead>
        <tr>

        </tr>
        </thead>
        <div class="container mt-5 mb-5">
            <form action="/driverq/driverq-add" method="post">


                <td><input type="checkbox" name="active" placeholder="Active" class="form-control"></td>
                <td><input type="text" name="firstName" placeholder="First Name" class="form-control"></td>
                <br>
                <td><input type="text" name="lastName" placeholder="Last Name" class="form-control"></td>
                <br>
                <td><input type="number" name="isikukood" placeholder="Isikukood" class="form-control"></td>
                <br>
                <td><input type="number" name="phone" placeholder="Phone" class="form-control"></td>
                <br>
                <td><input type="text" name="email" placeholder="E-mail" class="form-control"></td>
                <br>
                <td><input type="text" name="iban1" placeholder="IBAN1" class="form-control"></td>
                <br>
                <td><input type="text" name="iban2" placeholder="IBAN2" class="form-control"></td>
                <br>
                <td><input type="text" name="iban3" placeholder="IBAN3" class="form-control"></td>
                <br>
                <td><input type="text" name="driverLicenseNumber" placeholder="Driver License №" class="form-control">
                </td>
                <br>
                <td><input type="date" name="driverLicenseExp" placeholder="Date" class="form-control"></td>
                <br>
                <td><input type="text" name="taxiLicense" placeholder="TK111111" class="form-control"></td>
                <br>
                <td><input type="text" name="address" placeholder="Address" class="form-control"></td>
                <br>
                <td><textarea name="comments" placeholder="Comments" class="form-control"></textarea></td>
                <br>

                <td>
                    <button type="submit" class="btn btn-success"> OK</button>
                </td>


            </form>

        </div>
    </table>

</@common.page>