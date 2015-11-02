/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentDistributionFindBulkUdtTemplateItem.java
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
 * Class used to create a PrepaymentDistributionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PrepaymentDistributionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PrepaymentDistributionObjectFilter PDFindIn;
/**
 *
 * Constructor to create a  PrepaymentDistributionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PrepaymentDistributionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PrepaymentDistributionObjectFilter PDFindInIn) {
    super(id, context, "PrepaymentDistributionFind");
    PDFindIn = PDFindInIn;
  }

  public void translateToMap() {
    if (PDFindIn != null) {
      Integer index =  PDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PrepaymentDistribution", PrepaymentDistributionObjectHelper.toMap(PDFindIn, new HashMap(), "PrepaymentDistribution").get("PrepaymentDistribution"));
    }
  }


/**
 *
 * Sets the PrepaymentDistribution
 * @param PDFindInIn Value of the PDFindIn
 *
 */

  public void setPrepaymentDistribution(PrepaymentDistributionObjectFilter PDFindInIn) {
    PDFindIn = PDFindInIn;
  }

  public void translateFromMap() {
    PDFindIn = PrepaymentDistributionObjectHelper.fromMapFilter(inputMap, "PrepaymentDistribution");
  }

/**
 *
 * Gets the PrepaymentDistribution
 * @return Value of the PrepaymentDistribution
 *
 */

  public PrepaymentDistributionObjectFilter getPrepaymentDistribution( ) {
    return PDFindIn;
  }

}
