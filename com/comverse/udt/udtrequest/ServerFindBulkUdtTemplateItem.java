/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerFindBulkUdtTemplateItem.java
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
 * Class used to create a ServerFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServerFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServerObjectFilter S_DFindIn;
/**
 *
 * Constructor to create a  ServerFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServerFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServerObjectFilter S_DFindInIn) {
    super(id, context, "ServerFind");
    S_DFindIn = S_DFindInIn;
  }

  public void translateToMap() {
    if (S_DFindIn != null) {
      Integer index =  S_DFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Server", ServerObjectHelper.toMap(S_DFindIn, new HashMap(), "Server").get("Server"));
    }
  }


/**
 *
 * Sets the Server
 * @param S_DFindInIn Value of the S_DFindIn
 *
 */

  public void setServer(ServerObjectFilter S_DFindInIn) {
    S_DFindIn = S_DFindInIn;
  }

  public void translateFromMap() {
    S_DFindIn = ServerObjectHelper.fromMapFilter(inputMap, "Server");
  }

/**
 *
 * Gets the Server
 * @return Value of the Server
 *
 */

  public ServerObjectFilter getServer( ) {
    return S_DFindIn;
  }

}
