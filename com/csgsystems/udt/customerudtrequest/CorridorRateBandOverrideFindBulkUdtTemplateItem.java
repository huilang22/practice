/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRateBandOverrideFindBulkUdtTemplateItem.java
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
 * Class used to create a CorridorRateBandOverrideFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorRateBandOverrideFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CRBOObjectFilter CRBOFindIn;
/**
 *
 * Constructor to create a  CorridorRateBandOverrideFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorRateBandOverrideFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CRBOObjectFilter CRBOFindInIn) {
    super(id, context, "CorridorRateBandOverrideFind");
    CRBOFindIn = CRBOFindInIn;
  }

  public void translateToMap() {
    if (CRBOFindIn != null) {
      Integer index =  CRBOFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CorridorRateBandOverride", CRBOObjectHelper.toMap(CRBOFindIn, new HashMap(), "CorridorRateBandOverride").get("CorridorRateBandOverride"));
    }
  }


/**
 *
 * Sets the CorridorRateBandOverride
 * @param CRBOFindInIn Value of the CRBOFindIn
 *
 */

  public void setCorridorRateBandOverride(CRBOObjectFilter CRBOFindInIn) {
    CRBOFindIn = CRBOFindInIn;
  }

  public void translateFromMap() {
    CRBOFindIn = CRBOObjectHelper.fromMapFilter(inputMap, "CorridorRateBandOverride");
  }

/**
 *
 * Gets the CorridorRateBandOverride
 * @return Value of the CorridorRateBandOverride
 *
 */

  public CRBOObjectFilter getCorridorRateBandOverride( ) {
    return CRBOFindIn;
  }

}
