/*
 * Generated code DO NOT EDIT
 * Generated file: ConvertGeocodeNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ConvertGeocodeNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConvertGeocodeNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected String noOpIn;

/**
 *
 * Constructor to create a   ConvertGeocodeNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConvertGeocodeNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, String noOpInIn) {
    super(id, context, "ConvertGeocode");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("FXgeocode", noOpIn);
    }
  }
/**
 *
 * Sets the  FXgeocode
 * @param noOpInIn String to set
 *
 */
  public void setFXgeocode(String noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the FXgeocode passed into the constructor
 * @return Simulated response
 *
 */
  public String getFXgeocode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (String)inputMap.get("FXgeocode");
  }
}
