/*
 * Generated code DO NOT EDIT
 * Generated file: ExclusionCreateBulkUdtTemplateItem.java
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
 * Class used to create a ExclusionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExclusionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExclusionObjectData excCrIn;
/**
 *
 * Constructor to create a  ExclusionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExclusionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ExclusionObjectData excCrInIn) {
    super(id, context, "ExclusionCreate");
    excCrIn = excCrInIn;
  }

  public void translateToMap() {
    if (excCrIn != null) {
      excCrIn.resetFlags(true, true);
      addInput("Exclusion", ExclusionObjectHelper.toMap(excCrIn, new HashMap(), "Exclusion").get("Exclusion"));
    }
  }


/**
 *
 * Sets the Exclusion
 * @param excCrInIn Value of the excCrIn
 *
 */

  public void setExclusion(ExclusionObjectData excCrInIn) {
    excCrIn = excCrInIn;
  }

  public void translateFromMap() {
    excCrIn = ExclusionObjectHelper.fromMap(inputMap, "Exclusion");
  }

/**
 *
 * Gets the Exclusion
 * @return Value of the Exclusion
 *
 */

  public ExclusionObjectData getExclusion( ) {
    return excCrIn;
  }

}
