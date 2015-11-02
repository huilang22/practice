/*
 * Generated code DO NOT EDIT
 * Generated file: ServerDefinitionCreateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a ServerDefinitionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServerDefinitionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServerDefinitionObjectData SDCreateIn;
/**
 *
 * Constructor to create a  ServerDefinitionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServerDefinitionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServerDefinitionObjectData SDCreateInIn) {
    super(id, context, "ServerDefinitionCreate");
    SDCreateIn = SDCreateInIn;
  }

  public void translateToMap() {
    if (SDCreateIn != null) {
      SDCreateIn.resetFlags(true, true);
      addInput("ServerDefinition", ServerDefinitionObjectHelper.toMap(SDCreateIn, new HashMap(), "ServerDefinition").get("ServerDefinition"));
    }
  }


/**
 *
 * Sets the ServerDefinition
 * @param SDCreateInIn Value of the SDCreateIn
 *
 */

  public void setServerDefinition(ServerDefinitionObjectData SDCreateInIn) {
    SDCreateIn = SDCreateInIn;
  }

  public void translateFromMap() {
    SDCreateIn = ServerDefinitionObjectHelper.fromMap(inputMap, "ServerDefinition");
  }

/**
 *
 * Gets the ServerDefinition
 * @return Value of the ServerDefinition
 *
 */

  public ServerDefinitionObjectData getServerDefinition( ) {
    return SDCreateIn;
  }

}
