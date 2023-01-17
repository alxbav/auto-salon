<#import "../common/page.ftl" as common>
<@common.page>
    <h2> NEW Balance Transaction : </h2>
    <table class="table">
        <thead>


        <tr>
            <th> Week</th>
            <th> Date</th>
            <th> Driver ID</th>
            <th> Summa</th>
            <th> Transaction Type</th>
            <th> Comment</th>

        </tr>
        </thead>

        <div class="container mt-5 mb-5">
            <form action="/registration" method="post">

                <td><input type="number" name="week_number" placeholder="Week Number" class="form-control"></td>
                <br>
                <td><input type="date" name="date" placeholder="Date" class="form-control"></td>
                <br>
                <td><input type="number" name="driver_id" placeholder="Driver ID" class="form-control"></td><br>
                <td><input type="number" name="summ" placeholder="Summa" class="form-control"></td><br>
                <td><input type="number" name="transaction_type" placeholder="Transaction Type" class="form-control"></td><br>
                <td><textarea name="comments" placeholder="Comments" class="form-control"></textarea></td><br>

                <td><button type="submit" class="btn btn-success"> OK</button></td>
            </form>

        </div>


    </table>

</@common.page>