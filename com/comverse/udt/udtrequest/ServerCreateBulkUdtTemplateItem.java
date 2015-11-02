/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerCreateBulkUdtTemplateItem.java
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
 * Class used to create a ServerCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServerCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServerObjectData S_DCreateIn;
/**
 *
 * Constructor to create a  ServerCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServerCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServerObjectData S_DCreateInIn) {
    super(id, context, "ServerCreate");
    S_DCreateIn = S_DCreateInIn;
  }

  public void translateToMap() {
    if (S_DCreateIn != null) {
      S_DCreateIn.resetFlags(true, true);
      addInput("Server", ServerObjectHelper.toMap(S_DCreateIn, new HashMap(), "Server").get("Server"));
    }
  }


/**
 *
 * Sets the Server
 * @param S_DCreateInIn Value of the S_DCreateIn
 *
 */

  public void setServer(ServerObjectData S_DCreateInIn) {
    S_DCreateIn = S_DCreateInIn;
  }

  public void translateFromMap() {
    S_DCreateIn = ServerObjectHelper.fromMap(inputMap, "Server");
  }

/**
 *
 * Gets the Server
 * @return Value of the Server
 *
 */

  public ServerObjectData getServer( ) {
    return S_DCreateIn;
  }

}
