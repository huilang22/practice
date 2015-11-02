/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GlobalContractGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GlobalContractGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GlobalContractObjectData noOpIn;

/**
 *
 * Constructor to create a   GlobalContractGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GlobalContractGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalContractObjectData noOpInIn) {
    super(id, context, "GlobalContractGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GlobalContract", GlobalContractObjectHelper.toMap(noOpIn, new HashMap(), "GlobalContract").get("GlobalContract"));
    }
  }
/**
 *
 * Sets the  GlobalContract
 * @param noOpInIn GlobalContractObjectData to set
 *
 */
  public void setGlobalContract(GlobalContractObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GlobalContract passed into the constructor
 * @return Simulated response
 *
 */
  public GlobalContractObjectData getGlobalContract() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GlobalContractObjectHelper.fromMap(inputMap, "GlobalContract");
  }
}
