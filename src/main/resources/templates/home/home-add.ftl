<#import "../common/page.ftl" as common>
<@common.page>
    <h2> NEW Potential Driver : </h2>
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

        <div class="container mt-5 mb-5">
            <form action="/home/add" method="post">


                <td><input type="text" name="firstName" placeholder="First Name" class="form-control"></td>
                <br>
                <td><input type="text" name="lastName" placeholder="Last Name" class="form-control"></td>
                <br>
                <td><input type="number" name="phone" placeholder="Phone" class="form-control"></td><br>
                <td><input type="text" name="active1" placeholder="Active/Passive" class="form-control"></td><br>
                <td><textarea name="comments" placeholder="Comments" class="form-control"></textarea></td><br>

                <td><button type="submit" class="btn btn-success"> OK</button></td>
            </form>

        </div>


    </table>

</@common.page>