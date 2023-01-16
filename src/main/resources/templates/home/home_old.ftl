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

                <td><a id="edit-user" type="button" class="btn btn-success" data-toggle="modal"  data-target="#userEditDialog">  th:data-driverPotentialId="${driverPotential.id}"><i class="fas fa-edit"></i> </a>
                    <form class="d-inline" th:method="delete" th:action="@{id = (${driverPotential.id})}">
                        <button class="btn btn-danger"><i class="far fa-trash-alt"></i> Delete</button>
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
                        <input type="hidden" id="driverPotentialId">
                        <div class="form-group">
                            <label for="first-name" class="col-form-label">First name</label>
                            <input type="text" class="form-control" id="first-name">
                        </div>
                        <div class="form-group">
                            <label for="last-name" class="col-form-label">Last name</label>
                            <input type="text" class="form-control" id="last-name">
                        </div>
                        <div class="form-group">
                            <label for="phone" class="col-form-label">Phone</label>
                            <input type="text" class="form-control" id="phone">
                        </div>
                        <div class="form-group">
                            <label for="active" class="col-form-label">Active</label>
                            <input type="text" class="form-control" id="active">
                        </div>
                        <div class="form-group">
                            <label for="comment" class="col-form-label">Comment</label>
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


    <script>
        $('#userEditDialog').on('shown.bs.modal', function (event) {
            let button = $(event.relatedTarget) // Button that triggered the modal
            let driverPotentialId = button.data('driverPotentialId') // Extract info from data-* attributes

            if (driverPotentialId) {
                $.get({
                    url: '/api/v1/driverPotential/' + driverPotentialId,
                    success: (data) => {
                        let modal = $(this)
                        modal.find('#id').val(data.id)
                        modal.find('#firstName').val(data.username)
                        modal.find('#user-password').val(data.password)
                    },
                    error: (err) => {
                        alert(err);
                    }
                });
            }
        })



    </script>



</@common.page>