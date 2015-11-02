/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupContractsDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqGroupContractsDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupContractsDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupContractsObjectData noOpIn;

/**
 *
 * Constructor to create a   HqGroupContractsDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupContractsDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupContractsObjectData noOpInIn) {
    super(id, context, "HqGroupContractsDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(noOpIn, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }
/**
 *
 * Sets the  HqGroupContracts
 * @param noOpInIn HqGroupContractsObjectData to set
 *
 */
  public void setHqGroupContracts(HqGroupContractsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroupContracts passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupContractsObjectData getHqGroupContracts() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupContractsObjectHelper.fromMap(inputMap, "HqGroupContracts");
  }
}
