/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemMarketingDataPriceNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ItemMarketingDataPriceNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ItemMarketingDataPriceNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BigInteger noOpIn;

/**
 *
 * Constructor to create a   ItemMarketingDataPriceNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ItemMarketingDataPriceNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger noOpInIn) {
    super(id, context, "ItemMarketingDataPrice");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("ImdPrice", noOpIn);
    }
  }
/**
 *
 * Sets the  ImdPrice
 * @param noOpInIn BigInteger to set
 *
 */
  public void setImdPrice(BigInteger noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ImdPrice passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getImdPrice() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (BigInteger)inputMap.get("ImdPrice");
  }
}
