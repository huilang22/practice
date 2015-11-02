/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractUpdateBulkUdtTemplateItem.java
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
 * Class used to create a GlobalContractUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class GlobalContractUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GlobalContractObjectData GlobalContractUpdateIn;
/**
 *
 * Constructor to create a  GlobalContractUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GlobalContractUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalContractObjectData GlobalContractUpdateInIn) {
    super(id, context, "GlobalContractUpdate");
    GlobalContractUpdateIn = GlobalContractUpdateInIn;
  }

  public void translateToMap() {
    if (GlobalContractUpdateIn != null) {
      GlobalContractUpdateIn.resetFlags(true, true);
      addInput("GlobalContract", GlobalContractObjectHelper.toMap(GlobalContractUpdateIn, new HashMap(), "GlobalContract").get("GlobalContract"));
    }
  }


/**
 *
 * Sets the GlobalContract
 * @param GlobalContractUpdateInIn Value of the GlobalContractUpdateIn
 *
 */

  public void setGlobalContract(GlobalContractObjectData GlobalContractUpdateInIn) {
    GlobalContractUpdateIn = GlobalContractUpdateInIn;
  }

  public void translateFromMap() {
    GlobalContractUpdateIn = GlobalContractObjectHelper.fromMap(inputMap, "GlobalContract");
  }

/**
 *
 * Gets the GlobalContract
 * @return Value of the GlobalContract
 *
 */

  public GlobalContractObjectData getGlobalContract( ) {
    return GlobalContractUpdateIn;
  }

}
