/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractCreateBulkUdtTemplateItem.java
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
 * Class used to create a GlobalContractCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GlobalContractCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GlobalContractObjectData GlobalContractCreateIn;
/**
 *
 * Constructor to create a  GlobalContractCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GlobalContractCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalContractObjectData GlobalContractCreateInIn) {
    super(id, context, "GlobalContractCreate");
    GlobalContractCreateIn = GlobalContractCreateInIn;
  }

  public void translateToMap() {
    if (GlobalContractCreateIn != null) {
      GlobalContractCreateIn.resetFlags(true, true);
      addInput("GlobalContract", GlobalContractObjectHelper.toMap(GlobalContractCreateIn, new HashMap(), "GlobalContract").get("GlobalContract"));
    }
  }


/**
 *
 * Sets the GlobalContract
 * @param GlobalContractCreateInIn Value of the GlobalContractCreateIn
 *
 */

  public void setGlobalContract(GlobalContractObjectData GlobalContractCreateInIn) {
    GlobalContractCreateIn = GlobalContractCreateInIn;
  }

  public void translateFromMap() {
    GlobalContractCreateIn = GlobalContractObjectHelper.fromMap(inputMap, "GlobalContract");
  }

/**
 *
 * Gets the GlobalContract
 * @return Value of the GlobalContract
 *
 */

  public GlobalContractObjectData getGlobalContract( ) {
    return GlobalContractCreateIn;
  }

}
