/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDefinitionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ServerDefinitionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServerDefinitionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServerDefinitionObjectData SDUpdateIn;
/**
 *
 * Constructor to create a  ServerDefinitionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServerDefinitionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServerDefinitionObjectData SDUpdateInIn) {
    super(id, context, "ServerDefinitionUpdate");
    SDUpdateIn = SDUpdateInIn;
  }

  public void translateToMap() {
    if (SDUpdateIn != null) {
      SDUpdateIn.resetFlags(true, true);
      addInput("ServerDefinition", ServerDefinitionObjectHelper.toMap(SDUpdateIn, new HashMap(), "ServerDefinition").get("ServerDefinition"));
    }
  }


/**
 *
 * Sets the ServerDefinition
 * @param SDUpdateInIn Value of the SDUpdateIn
 *
 */

  public void setServerDefinition(ServerDefinitionObjectData SDUpdateInIn) {
    SDUpdateIn = SDUpdateInIn;
  }

  public void translateFromMap() {
    SDUpdateIn = ServerDefinitionObjectHelper.fromMap(inputMap, "ServerDefinition");
  }

/**
 *
 * Gets the ServerDefinition
 * @return Value of the ServerDefinition
 *
 */

  public ServerDefinitionObjectData getServerDefinition( ) {
    return SDUpdateIn;
  }

}
