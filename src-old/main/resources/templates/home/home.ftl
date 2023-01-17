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

            <td><a class="btn btn-primary" href="redirect:/driver-info.ftl" role="button"> Link </a></td>
        </tr>
    </table>

    <h2> Водители: </h2>
    <table class="table">
        <thead>
        <tr>
            <th> Driver ID</th>
            <th> Driver Firstname</th>
            <th> Driver Lastname</th>
            <th> Car Number</th>
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

            <td><a class="btn btn-primary" href="redirect:/driver-info.ftl" role="button"> Info </a></td>
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
            <th> Comment</th>
            <th>
                <button id="create-user" type="button" class="btn btn-primary" data-toggle="modal"
                        data-target="#userEditDialog"> NEW
                </button>
            </th>
        </tr>
        </thead>
        <#list driverpotentials as driverPotential>
            <tr>

                <td> ${driverPotential.firstName}</td>
                <td> ${driverPotential.lastName}</td>
                <td> ${driverPotential.phone}</td>
                <td> ${driverPotential.active}</td>
                <td> ${driverPotential.comment}</td>

                <td><a class="btn btn-primary" role="button"> Edit </a>
                    <form class="d-inline" method="delete" action="@{driverPotential.id}">
                        <button class="btn btn-danger"> Delete</button>
                    </form>
                </td>
            </tr>



        </#list>

    </table>

    <div class="modal fade" id="userEditDialog" tabindex="-1" role="dialog" aria-labelledby="userEditDialogLabel"
         aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="userEditDialogLabel">Edit user</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <form>
                        <input type="hidden" id="user-id">
                        <div class="form-group">
                            <label for="user-name" class="col-form-label">First name</label>
                            <input type="text" class="form-control" id="user-name">
                        </div>
                        <div class="form-group">
                            <label for="user-name" class="col-form-label">Last name</label>
                            <input type="text" class="form-control" id="user-name">
                        </div>
                        <div class="form-group">
                            <label for="user-name" class="col-form-label">Phone</label>
                            <input type="text" class="form-control" id="user-name">
                        </div>
                        <div class="form-group">
                            <label for="user-name" class="col-form-label">Comment</label>
                            <textarea name="comment" class="form-control"></textarea>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button id="save-user-button" type="button" class="btn btn-primary">Save</button>
                </div>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha384-tsQFqpEReu7ZLhBV2VZlAu7zcOV+rXbYlF2cqB8txI/8aZajjp4Bqd+V6D5IgvKT"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>


</@common.page>