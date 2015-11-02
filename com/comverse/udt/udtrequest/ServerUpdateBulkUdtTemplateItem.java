/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ServerUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServerUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServerObjectData S_DUpdateIn;
/**
 *
 * Constructor to create a  ServerUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServerUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServerObjectData S_DUpdateInIn) {
    super(id, context, "ServerUpdate");
    S_DUpdateIn = S_DUpdateInIn;
  }

  public void translateToMap() {
    if (S_DUpdateIn != null) {
      S_DUpdateIn.resetFlags(true, true);
      addInput("Server", ServerObjectHelper.toMap(S_DUpdateIn, new HashMap(), "Server").get("Server"));
    }
  }


/**
 *
 * Sets the Server
 * @param S_DUpdateInIn Value of the S_DUpdateIn
 *
 */

  public void setServer(ServerObjectData S_DUpdateInIn) {
    S_DUpdateIn = S_DUpdateInIn;
  }

  public void translateFromMap() {
    S_DUpdateIn = ServerObjectHelper.fromMap(inputMap, "Server");
  }

/**
 *
 * Gets the Server
 * @return Value of the Server
 *
 */

  public ServerObjectData getServer( ) {
    return S_DUpdateIn;
  }

}
