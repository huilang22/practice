/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDefinitionFindBulkUdtTemplateItem.java
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
 * Class used to create a ServerDefinitionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServerDefinitionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServerDefinitionObjectFilter SDFindIn;
/**
 *
 * Constructor to create a  ServerDefinitionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServerDefinitionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServerDefinitionObjectFilter SDFindInIn) {
    super(id, context, "ServerDefinitionFind");
    SDFindIn = SDFindInIn;
  }

  public void translateToMap() {
    if (SDFindIn != null) {
      Integer index =  SDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServerDefinition", ServerDefinitionObjectHelper.toMap(SDFindIn, new HashMap(), "ServerDefinition").get("ServerDefinition"));
    }
  }


/**
 *
 * Sets the ServerDefinition
 * @param SDFindInIn Value of the SDFindIn
 *
 */

  public void setServerDefinition(ServerDefinitionObjectFilter SDFindInIn) {
    SDFindIn = SDFindInIn;
  }

  public void translateFromMap() {
    SDFindIn = ServerDefinitionObjectHelper.fromMapFilter(inputMap, "ServerDefinition");
  }

/**
 *
 * Gets the ServerDefinition
 * @return Value of the ServerDefinition
 *
 */

  public ServerDefinitionObjectFilter getServerDefinition( ) {
    return SDFindIn;
  }

}
