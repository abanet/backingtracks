$(document)
    .ready(
        function() {


            //
            // Tabla de Backingtracks
            //
            var tablaVideos = $('#tablaVideos').DataTable({
                dom: 'Bfrtlip',
                idSrc: 'id',
                lengthMenu: [[25, 50, 100, 200, 500, -1],
                    [25, 50, 100, 200, 500, "Todos"]],
                info: true,
                autoWidth: false,
                ordering: true,

                ajax: {
                    type: "GET",
                    url: window.location.origin + '/videos/listaVideos/',
                    dataType: 'json',
                    dataSrc: '',
                },
                columns: [
                    {
                        data: "id",

                    },
                    {
                        data: "titulo",

                    },
                    {
                        data: "url",

                    },
                    {
                        data: "fechaCatalogacion",

                    },
                    {
                        data: "bpm",

                    },
                    {
                        data: "tono",

                    },
                    {
                        data: "puntuacion",

                    },


                ],
            });


        });
