/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxExemptionFindBulkUdtTemplateItem.java
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
 * Class used to create a TaxExemptionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class TaxExemptionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TaxExemptionObjectFilter TEfindIn;
/**
 *
 * Constructor to create a  TaxExemptionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TaxExemptionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxExemptionObjectFilter TEfindInIn) {
    super(id, context, "TaxExemptionFind");
    TEfindIn = TEfindInIn;
  }

  public void translateToMap() {
    if (TEfindIn != null) {
      Integer index =  TEfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(TEfindIn, new HashMap(), "TaxExemption").get("TaxExemption"));
    }
  }


/**
 *
 * Sets the TaxExemption
 * @param TEfindInIn Value of the TEfindIn
 *
 */

  public void setTaxExemption(TaxExemptionObjectFilter TEfindInIn) {
    TEfindIn = TEfindInIn;
  }

  public void translateFromMap() {
    TEfindIn = TaxExemptionObjectHelper.fromMapFilter(inputMap, "TaxExemption");
  }

/**
 *
 * Gets the TaxExemption
 * @return Value of the TaxExemption
 *
 */

  public TaxExemptionObjectFilter getTaxExemption( ) {
    return TEfindIn;
  }

}
