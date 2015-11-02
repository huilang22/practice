/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDefinitionGetBulkUdtTemplateItem.java
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
 * Class used to create a ServerDefinitionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServerDefinitionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServerDefinitionObjectKeyData SDGetIn;
/**
 *
 * Constructor to create a  ServerDefinitionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServerDefinitionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServerDefinitionObjectKeyData SDGetInIn) {
    super(id, context, "ServerDefinitionGet");
    SDGetIn = SDGetInIn;
  }

  public void translateToMap() {
    if (SDGetIn != null) {
      SDGetIn.resetFlags(true, true);
      addInput("ServerDefinition", ServerDefinitionObjectKeyHelper.toMap(SDGetIn, new HashMap(), "ServerDefinitionObjectKeyData").get("ServerDefinitionObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServerDefinition
 * @param SDGetInIn Value of the SDGetIn
 *
 */

  public void setServerDefinition(ServerDefinitionObjectKeyData SDGetInIn) {
    SDGetIn = SDGetInIn;
  }

  public void translateFromMap() {
    SDGetIn = ServerDefinitionObjectKeyHelper.fromMap(inputMap, "ServerDefinition");
  }

/**
 *
 * Gets the ServerDefinition
 * @return Value of the ServerDefinition
 *
 */

  public ServerDefinitionObjectKeyData getServerDefinition( ) {
    return SDGetIn;
  }

}
