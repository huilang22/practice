/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ServerDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ServerDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServerObjectKeyData S_DDeleteIn;
/**
 *
 * Constructor to create a  ServerDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServerDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ServerObjectKeyData S_DDeleteInIn) {
    super(id, context, "ServerDelete");
    S_DDeleteIn = S_DDeleteInIn;
  }

  public void translateToMap() {
    if (S_DDeleteIn != null) {
      S_DDeleteIn.resetFlags(true, true);
      addInput("Server", ServerObjectKeyHelper.toMap(S_DDeleteIn, new HashMap(), "ServerObjectKeyData").get("ServerObjectKeyData"));
    }
  }


/**
 *
 * Sets the Server
 * @param S_DDeleteInIn Value of the S_DDeleteIn
 *
 */

  public void setServer(ServerObjectKeyData S_DDeleteInIn) {
    S_DDeleteIn = S_DDeleteInIn;
  }

  public void translateFromMap() {
    S_DDeleteIn = ServerObjectKeyHelper.fromMap(inputMap, "Server");
  }

/**
 *
 * Gets the Server
 * @return Value of the Server
 *
 */

  public ServerObjectKeyData getServer( ) {
    return S_DDeleteIn;
  }

}
