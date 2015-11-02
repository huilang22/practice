/*
 * Generated code DO NOT EDIT
 * Generated file: NrcFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a NrcFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectBaseFilter NrcFindIn;
  protected Boolean ViewableOnly;
/**
 *
 * Constructor to create a  NrcFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectBaseFilter NrcFindInIn, Boolean ViewableOnlyIn) {
    super(id, context, "NrcFind");
    NrcFindIn = NrcFindInIn;
    ViewableOnly = ViewableOnlyIn;
  }

  public void translateToMap() {
    if (NrcFindIn != null) {
      Integer index =  NrcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcFindIn, new HashMap(), "Nrc").get("Nrc"));
    }
    if (ViewableOnly != null) {
      addInput("ViewableOnly", ViewableOnly);
    }
  }


/**
 *
 * Sets the Nrc
 * @param NrcFindInIn Value of the NrcFindIn
 *
 */

  public void setNrc(NrcObjectBaseFilter NrcFindInIn) {
    NrcFindIn = NrcFindInIn;
  }

/**
 *
 * Sets the ViewableOnly
 * @param ViewableOnlyIn Value of the ViewableOnly
 *
 */

  public void setViewableOnly(Boolean ViewableOnlyIn) {
    ViewableOnly = ViewableOnlyIn;
  }

  public void translateFromMap() {
    NrcFindIn = NrcObjectBaseHelper.fromMapFilter(inputMap, "Nrc");
    ViewableOnly = (Boolean)inputMap.get("ViewableOnly");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectBaseFilter getNrc( ) {
    return NrcFindIn;
  }

/**
 *
 * Gets the ViewableOnly
 * @return Value of the ViewableOnly
 *
 */

  public Boolean getViewableOnly( ) {
    return ViewableOnly;
  }

}
