/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTransDescrValidateCreateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a NrcTransDescrValidateCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcTransDescrValidateCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcTransDescrObjectData NrcTransDescrIn;
  protected Integer ServiceInternalId;
  protected Integer ServiceInternalIdResets;
/**
 *
 * Constructor to create a  NrcTransDescrValidateCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcTransDescrValidateCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTransDescrObjectData NrcTransDescrInIn, Integer ServiceInternalIdIn, Integer ServiceInternalIdResetsIn) {
    super(id, context, "NrcTransDescrValidateCreate");
    NrcTransDescrIn = NrcTransDescrInIn;
    ServiceInternalId = ServiceInternalIdIn;
    ServiceInternalIdResets = ServiceInternalIdResetsIn;
  }

  public void translateToMap() {
    if (NrcTransDescrIn != null) {
      NrcTransDescrIn.resetFlags(true, true);
      addInput("NrcTransDescrValidate", NrcTransDescrObjectHelper.toMap(NrcTransDescrIn, new HashMap(), "NrcTransDescrValidate").get("NrcTransDescrValidate"));
    }
    if (ServiceInternalId != null) {
      addInput("ServiceInternalId", ServiceInternalId);
    }
    if (ServiceInternalIdResets != null) {
      addInput("ServiceInternalIdResets", ServiceInternalIdResets);
    }
  }


/**
 *
 * Sets the NrcTransDescrValidate
 * @param NrcTransDescrInIn Value of the NrcTransDescrIn
 *
 */

  public void setNrcTransDescrValidate(NrcTransDescrObjectData NrcTransDescrInIn) {
    NrcTransDescrIn = NrcTransDescrInIn;
  }

/**
 *
 * Sets the ServiceInternalId
 * @param ServiceInternalIdIn Value of the ServiceInternalId
 *
 */

  public void setServiceInternalId(Integer ServiceInternalIdIn) {
    ServiceInternalId = ServiceInternalIdIn;
  }

/**
 *
 * Sets the ServiceInternalIdResets
 * @param ServiceInternalIdResetsIn Value of the ServiceInternalIdResets
 *
 */

  public void setServiceInternalIdResets(Integer ServiceInternalIdResetsIn) {
    ServiceInternalIdResets = ServiceInternalIdResetsIn;
  }

  public void translateFromMap() {
    NrcTransDescrIn = NrcTransDescrObjectHelper.fromMap(inputMap, "NrcTransDescrValidate");
    ServiceInternalId = (Integer)inputMap.get("ServiceInternalId");
    ServiceInternalIdResets = (Integer)inputMap.get("ServiceInternalIdResets");
  }

/**
 *
 * Gets the NrcTransDescrValidate
 * @return Value of the NrcTransDescrValidate
 *
 */

  public NrcTransDescrObjectData getNrcTransDescrValidate( ) {
    return NrcTransDescrIn;
  }

/**
 *
 * Gets the ServiceInternalId
 * @return Value of the ServiceInternalId
 *
 */

  public Integer getServiceInternalId( ) {
    return ServiceInternalId;
  }

/**
 *
 * Gets the ServiceInternalIdResets
 * @return Value of the ServiceInternalIdResets
 *
 */

  public Integer getServiceInternalIdResets( ) {
    return ServiceInternalIdResets;
  }

}
