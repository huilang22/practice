/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerFindNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ServerFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServerFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServerObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServerFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServerFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServerObjectDataList noOpInIn) {
    super(id, context, "ServerFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = ServerObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Server", noOpIn);
      }
      addInput("Server", mapList);
    }
  }
/**
 *
 * Sets the  Server
 * @param noOpInIn ServerObjectDataList to set
 *
 */
  public void setServer(ServerObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Server passed into the constructor
 * @return Simulated response
 *
 */
  public ServerObjectDataList getServer() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServerObjectHelper.fromMapList(inputMap, "ServerList");
  }
}
