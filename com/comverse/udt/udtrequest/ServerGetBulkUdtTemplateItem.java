/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerGetBulkUdtTemplateItem.java
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
 * Class used to create a ServerGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServerGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServerObjectKeyData S_DGetIn;
/**
 *
 * Constructor to create a  ServerGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServerGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServerObjectKeyData S_DGetInIn) {
    super(id, context, "ServerGet");
    S_DGetIn = S_DGetInIn;
  }

  public void translateToMap() {
    if (S_DGetIn != null) {
      S_DGetIn.resetFlags(true, true);
      addInput("Server", ServerObjectKeyHelper.toMap(S_DGetIn, new HashMap(), "ServerObjectKeyData").get("ServerObjectKeyData"));
    }
  }


/**
 *
 * Sets the Server
 * @param S_DGetInIn Value of the S_DGetIn
 *
 */

  public void setServer(ServerObjectKeyData S_DGetInIn) {
    S_DGetIn = S_DGetInIn;
  }

  public void translateFromMap() {
    S_DGetIn = ServerObjectKeyHelper.fromMap(inputMap, "Server");
  }

/**
 *
 * Gets the Server
 * @return Value of the Server
 *
 */

  public ServerObjectKeyData getServer( ) {
    return S_DGetIn;
  }

}
