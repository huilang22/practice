/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDefinitionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ServerDefinitionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ServerDefinitionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServerDefinitionObjectKeyData SDDeleteIn;
/**
 *
 * Constructor to create a  ServerDefinitionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServerDefinitionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ServerDefinitionObjectKeyData SDDeleteInIn) {
    super(id, context, "ServerDefinitionDelete");
    SDDeleteIn = SDDeleteInIn;
  }

  public void translateToMap() {
    if (SDDeleteIn != null) {
      SDDeleteIn.resetFlags(true, true);
      addInput("ServerDefinition", ServerDefinitionObjectKeyHelper.toMap(SDDeleteIn, new HashMap(), "ServerDefinitionObjectKeyData").get("ServerDefinitionObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServerDefinition
 * @param SDDeleteInIn Value of the SDDeleteIn
 *
 */

  public void setServerDefinition(ServerDefinitionObjectKeyData SDDeleteInIn) {
    SDDeleteIn = SDDeleteInIn;
  }

  public void translateFromMap() {
    SDDeleteIn = ServerDefinitionObjectKeyHelper.fromMap(inputMap, "ServerDefinition");
  }

/**
 *
 * Gets the ServerDefinition
 * @return Value of the ServerDefinition
 *
 */

  public ServerDefinitionObjectKeyData getServerDefinition( ) {
    return SDDeleteIn;
  }

}
