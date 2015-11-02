/*
 * Generated code DO NOT EDIT
 * Generated file: UsagePointUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UsagePointUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsagePointUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsgPntObjectData UsgPntUpdateIn;
/**
 *
 * Constructor to create a  UsagePointUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsagePointUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsgPntObjectData UsgPntUpdateInIn) {
    super(id, context, "UsagePointUpdate");
    UsgPntUpdateIn = UsgPntUpdateInIn;
  }

  public void translateToMap() {
    if (UsgPntUpdateIn != null) {
      UsgPntUpdateIn.resetFlags(true, true);
      addInput("UsagePoint", UsgPntObjectHelper.toMap(UsgPntUpdateIn, new HashMap(), "UsagePoint").get("UsagePoint"));
    }
  }


/**
 *
 * Sets the UsagePoint
 * @param UsgPntUpdateInIn Value of the UsgPntUpdateIn
 *
 */

  public void setUsagePoint(UsgPntObjectData UsgPntUpdateInIn) {
    UsgPntUpdateIn = UsgPntUpdateInIn;
  }

  public void translateFromMap() {
    UsgPntUpdateIn = UsgPntObjectHelper.fromMap(inputMap, "UsagePoint");
  }

/**
 *
 * Gets the UsagePoint
 * @return Value of the UsagePoint
 *
 */

  public UsgPntObjectData getUsagePoint( ) {
    return UsgPntUpdateIn;
  }

}
