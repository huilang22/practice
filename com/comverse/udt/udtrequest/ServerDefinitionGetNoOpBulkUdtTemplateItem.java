/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDefinitionGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServerDefinitionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServerDefinitionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServerDefinitionObjectData noOpIn;

/**
 *
 * Constructor to create a   ServerDefinitionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServerDefinitionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServerDefinitionObjectData noOpInIn) {
    super(id, context, "ServerDefinitionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServerDefinition", ServerDefinitionObjectHelper.toMap(noOpIn, new HashMap(), "ServerDefinition").get("ServerDefinition"));
    }
  }
/**
 *
 * Sets the  ServerDefinition
 * @param noOpInIn ServerDefinitionObjectData to set
 *
 */
  public void setServerDefinition(ServerDefinitionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServerDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public ServerDefinitionObjectData getServerDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServerDefinitionObjectHelper.fromMap(inputMap, "ServerDefinition");
  }
}