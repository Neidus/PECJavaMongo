rs.initiate(
    {
       _id: "nodoConfig",
       configsvr: true,
       version: 1,
       members: [
          { _id: 0, host : "nodoConfig1" },
          { _id: 1, host : "nodoConfig2" },
          { _id: 2, host : "nodoConfig3" }
       ]
    }
 )