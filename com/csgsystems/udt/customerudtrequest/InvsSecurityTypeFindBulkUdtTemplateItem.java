/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSecurityTypeFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsSecurityTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSecurityTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSecurityTypeObjectFilter InvsSecurityTypeFindIn;
/**
 *
 * Constructor to create a  InvsSecurityTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSecurityTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSecurityTypeObjectFilter InvsSecurityTypeFindInIn) {
    super(id, context, "InvsSecurityTypeFind");
    InvsSecurityTypeFindIn = InvsSecurityTypeFindInIn;
  }

  public void translateToMap() {
    if (InvsSecurityTypeFindIn != null) {
      Integer index =  InvsSecurityTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSecurityType", InvsSecurityTypeObjectHelper.toMap(InvsSecurityTypeFindIn, new HashMap(), "InvsSecurityType").get("InvsSecurityType"));
    }
  }


/**
 *
 * Sets the InvsSecurityType
 * @param InvsSecurityTypeFindInIn Value of the InvsSecurityTypeFindIn
 *
 */

  public void setInvsSecurityType(InvsSecurityTypeObjectFilter InvsSecurityTypeFindInIn) {
    InvsSecurityTypeFindIn = InvsSecurityTypeFindInIn;
  }

  public void translateFromMap() {
    InvsSecurityTypeFindIn = InvsSecurityTypeObjectHelper.fromMapFilter(inputMap, "InvsSecurityType");
  }

/**
 *
 * Gets the InvsSecurityType
 * @return Value of the InvsSecurityType
 *
 */

  public InvsSecurityTypeObjectFilter getInvsSecurityType( ) {
    return InvsSecurityTypeFindIn;
  }

}
