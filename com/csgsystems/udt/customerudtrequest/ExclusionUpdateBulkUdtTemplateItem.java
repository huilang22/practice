/*
 * Generated code DO NOT EDIT
 * Generated file: ExclusionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ExclusionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExclusionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExclusionObjectData excUpdIn;
/**
 *
 * Constructor to create a  ExclusionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExclusionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ExclusionObjectData excUpdInIn) {
    super(id, context, "ExclusionUpdate");
    excUpdIn = excUpdInIn;
  }

  public void translateToMap() {
    if (excUpdIn != null) {
      excUpdIn.resetFlags(true, true);
      addInput("Exclusion", ExclusionObjectHelper.toMap(excUpdIn, new HashMap(), "Exclusion").get("Exclusion"));
    }
  }


/**
 *
 * Sets the Exclusion
 * @param excUpdInIn Value of the excUpdIn
 *
 */

  public void setExclusion(ExclusionObjectData excUpdInIn) {
    excUpdIn = excUpdInIn;
  }

  public void translateFromMap() {
    excUpdIn = ExclusionObjectHelper.fromMap(inputMap, "Exclusion");
  }

/**
 *
 * Gets the Exclusion
 * @return Value of the Exclusion
 *
 */

  public ExclusionObjectData getExclusion( ) {
    return excUpdIn;
  }

}
