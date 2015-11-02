/*
 * Generated code DO NOT EDIT
 * Generated file: ParentCodeDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ParentCodeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ParentCodeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ParentCodeObjectKeyData ParentCodeDeleteIn;
/**
 *
 * Constructor to create a  ParentCodeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ParentCodeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ParentCodeObjectKeyData ParentCodeDeleteInIn) {
    super(id, context, "ParentCodeDelete");
    ParentCodeDeleteIn = ParentCodeDeleteInIn;
  }

  public void translateToMap() {
    if (ParentCodeDeleteIn != null) {
      ParentCodeDeleteIn.resetFlags(true, true);
      addInput("ParentCode", ParentCodeObjectKeyHelper.toMap(ParentCodeDeleteIn, new HashMap(), "ParentCodeObjectKeyData").get("ParentCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the ParentCode
 * @param ParentCodeDeleteInIn Value of the ParentCodeDeleteIn
 *
 */

  public void setParentCode(ParentCodeObjectKeyData ParentCodeDeleteInIn) {
    ParentCodeDeleteIn = ParentCodeDeleteInIn;
  }

  public void translateFromMap() {
    ParentCodeDeleteIn = ParentCodeObjectKeyHelper.fromMap(inputMap, "ParentCode");
  }

/**
 *
 * Gets the ParentCode
 * @return Value of the ParentCode
 *
 */

  public ParentCodeObjectKeyData getParentCode( ) {
    return ParentCodeDeleteIn;
  }

}
