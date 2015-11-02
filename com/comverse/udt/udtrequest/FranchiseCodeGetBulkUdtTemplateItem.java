/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * FranchiseCodeGetBulkUdtTemplateItem.java
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
 * Class used to create a FranchiseCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class FranchiseCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected FranchiseCodeObjectKeyData FCGetIn;
/**
 *
 * Constructor to create a  FranchiseCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public FranchiseCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, FranchiseCodeObjectKeyData FCGetInIn) {
    super(id, context, "FranchiseCodeGet");
    FCGetIn = FCGetInIn;
  }

  public void translateToMap() {
    if (FCGetIn != null) {
      FCGetIn.resetFlags(true, true);
      addInput("FranchiseCode", FranchiseCodeObjectKeyHelper.toMap(FCGetIn, new HashMap(), "FranchiseCodeObjectKeyData").get("FranchiseCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the FranchiseCode
 * @param FCGetInIn Value of the FCGetIn
 *
 */

  public void setFranchiseCode(FranchiseCodeObjectKeyData FCGetInIn) {
    FCGetIn = FCGetInIn;
  }

  public void translateFromMap() {
    FCGetIn = FranchiseCodeObjectKeyHelper.fromMap(inputMap, "FranchiseCode");
  }

/**
 *
 * Gets the FranchiseCode
 * @return Value of the FranchiseCode
 *
 */

  public FranchiseCodeObjectKeyData getFranchiseCode( ) {
    return FCGetIn;
  }

}
