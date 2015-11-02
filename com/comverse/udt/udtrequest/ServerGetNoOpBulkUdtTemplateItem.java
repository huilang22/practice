/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServerGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServerGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServerObjectData noOpIn;

/**
 *
 * Constructor to create a   ServerGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServerGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServerObjectData noOpInIn) {
    super(id, context, "ServerGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Server", ServerObjectHelper.toMap(noOpIn, new HashMap(), "Server").get("Server"));
    }
  }
/**
 *
 * Sets the  Server
 * @param noOpInIn ServerObjectData to set
 *
 */
  public void setServer(ServerObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Server passed into the constructor
 * @return Simulated response
 *
 */
  public ServerObjectData getServer() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServerObjectHelper.fromMap(inputMap, "Server");
  }
}
