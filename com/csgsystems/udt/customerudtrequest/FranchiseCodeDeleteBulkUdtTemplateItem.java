/*
 * Generated code DO NOT EDIT
 * Generated file: FranchiseCodeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a FranchiseCodeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class FranchiseCodeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected FranchiseCodeObjectKeyData FCDeleteIn;
/**
 *
 * Constructor to create a  FranchiseCodeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public FranchiseCodeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, FranchiseCodeObjectKeyData FCDeleteInIn) {
    super(id, context, "FranchiseCodeDelete");
    FCDeleteIn = FCDeleteInIn;
  }

  public void translateToMap() {
    if (FCDeleteIn != null) {
      FCDeleteIn.resetFlags(true, true);
      addInput("FranchiseCode", FranchiseCodeObjectKeyHelper.toMap(FCDeleteIn, new HashMap(), "FranchiseCodeObjectKeyData").get("FranchiseCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the FranchiseCode
 * @param FCDeleteInIn Value of the FCDeleteIn
 *
 */

  public void setFranchiseCode(FranchiseCodeObjectKeyData FCDeleteInIn) {
    FCDeleteIn = FCDeleteInIn;
  }

  public void translateFromMap() {
    FCDeleteIn = FranchiseCodeObjectKeyHelper.fromMap(inputMap, "FranchiseCode");
  }

/**
 *
 * Gets the FranchiseCode
 * @return Value of the FranchiseCode
 *
 */

  public FranchiseCodeObjectKeyData getFranchiseCode( ) {
    return FCDeleteIn;
  }

}
