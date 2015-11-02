/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractGetBulkUdtTemplateItem.java
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
 * Class used to create a GlobalContractGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GlobalContractGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GlobalContractObjectKeyData GlobalContractGetIn;
/**
 *
 * Constructor to create a  GlobalContractGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GlobalContractGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalContractObjectKeyData GlobalContractGetInIn) {
    super(id, context, "GlobalContractGet");
    GlobalContractGetIn = GlobalContractGetInIn;
  }

  public void translateToMap() {
    if (GlobalContractGetIn != null) {
      GlobalContractGetIn.resetFlags(true, true);
      addInput("GlobalContract", GlobalContractObjectKeyHelper.toMap(GlobalContractGetIn, new HashMap(), "GlobalContractObjectKeyData").get("GlobalContractObjectKeyData"));
    }
  }


/**
 *
 * Sets the GlobalContract
 * @param GlobalContractGetInIn Value of the GlobalContractGetIn
 *
 */

  public void setGlobalContract(GlobalContractObjectKeyData GlobalContractGetInIn) {
    GlobalContractGetIn = GlobalContractGetInIn;
  }

  public void translateFromMap() {
    GlobalContractGetIn = GlobalContractObjectKeyHelper.fromMap(inputMap, "GlobalContract");
  }

/**
 *
 * Gets the GlobalContract
 * @return Value of the GlobalContract
 *
 */

  public GlobalContractObjectKeyData getGlobalContract( ) {
    return GlobalContractGetIn;
  }

}
