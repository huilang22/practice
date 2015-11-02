/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * FranchiseCodeFindBulkUdtTemplateItem.java
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
 * Class used to create a FranchiseCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class FranchiseCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected FranchiseCodeObjectFilter FCFindIn;
/**
 *
 * Constructor to create a  FranchiseCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public FranchiseCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, FranchiseCodeObjectFilter FCFindInIn) {
    super(id, context, "FranchiseCodeFind");
    FCFindIn = FCFindInIn;
  }

  public void translateToMap() {
    if (FCFindIn != null) {
      Integer index =  FCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("FranchiseCode", FranchiseCodeObjectHelper.toMap(FCFindIn, new HashMap(), "FranchiseCode").get("FranchiseCode"));
    }
  }


/**
 *
 * Sets the FranchiseCode
 * @param FCFindInIn Value of the FCFindIn
 *
 */

  public void setFranchiseCode(FranchiseCodeObjectFilter FCFindInIn) {
    FCFindIn = FCFindInIn;
  }

  public void translateFromMap() {
    FCFindIn = FranchiseCodeObjectHelper.fromMapFilter(inputMap, "FranchiseCode");
  }

/**
 *
 * Gets the FranchiseCode
 * @return Value of the FranchiseCode
 *
 */

  public FranchiseCodeObjectFilter getFranchiseCode( ) {
    return FCFindIn;
  }

}
