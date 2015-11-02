/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * FranchiseCodeCreateBulkUdtTemplateItem.java
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
 * Class used to create a FranchiseCodeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class FranchiseCodeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected FranchiseCodeObjectData FCCreateIn;
/**
 *
 * Constructor to create a  FranchiseCodeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public FranchiseCodeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, FranchiseCodeObjectData FCCreateInIn) {
    super(id, context, "FranchiseCodeCreate");
    FCCreateIn = FCCreateInIn;
  }

  public void translateToMap() {
    if (FCCreateIn != null) {
      FCCreateIn.resetFlags(true, true);
      addInput("FranchiseCode", FranchiseCodeObjectHelper.toMap(FCCreateIn, new HashMap(), "FranchiseCode").get("FranchiseCode"));
    }
  }


/**
 *
 * Sets the FranchiseCode
 * @param FCCreateInIn Value of the FCCreateIn
 *
 */

  public void setFranchiseCode(FranchiseCodeObjectData FCCreateInIn) {
    FCCreateIn = FCCreateInIn;
  }

  public void translateFromMap() {
    FCCreateIn = FranchiseCodeObjectHelper.fromMap(inputMap, "FranchiseCode");
  }

/**
 *
 * Gets the FranchiseCode
 * @return Value of the FranchiseCode
 *
 */

  public FranchiseCodeObjectData getFranchiseCode( ) {
    return FCCreateIn;
  }

}
