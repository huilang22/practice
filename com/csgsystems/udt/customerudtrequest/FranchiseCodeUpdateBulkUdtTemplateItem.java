/*
 * Generated code DO NOT EDIT
 * Generated file: FranchiseCodeUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a FranchiseCodeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class FranchiseCodeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected FranchiseCodeObjectData FCUpdateIn;
/**
 *
 * Constructor to create a  FranchiseCodeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public FranchiseCodeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, FranchiseCodeObjectData FCUpdateInIn) {
    super(id, context, "FranchiseCodeUpdate");
    FCUpdateIn = FCUpdateInIn;
  }

  public void translateToMap() {
    if (FCUpdateIn != null) {
      FCUpdateIn.resetFlags(true, true);
      addInput("FranchiseCode", FranchiseCodeObjectHelper.toMap(FCUpdateIn, new HashMap(), "FranchiseCode").get("FranchiseCode"));
    }
  }


/**
 *
 * Sets the FranchiseCode
 * @param FCUpdateInIn Value of the FCUpdateIn
 *
 */

  public void setFranchiseCode(FranchiseCodeObjectData FCUpdateInIn) {
    FCUpdateIn = FCUpdateInIn;
  }

  public void translateFromMap() {
    FCUpdateIn = FranchiseCodeObjectHelper.fromMap(inputMap, "FranchiseCode");
  }

/**
 *
 * Gets the FranchiseCode
 * @return Value of the FranchiseCode
 *
 */

  public FranchiseCodeObjectData getFranchiseCode( ) {
    return FCUpdateIn;
  }

}
