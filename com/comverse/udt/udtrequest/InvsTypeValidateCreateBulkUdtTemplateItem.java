/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeValidateCreateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a InvsTypeValidateCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsTypeValidateCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsTypeObjectData InvsTypeIn;
  protected Integer ServiceInternalId;
  protected Integer ServiceInternalIdResets;
/**
 *
 * Constructor to create a  InvsTypeValidateCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsTypeValidateCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeObjectData InvsTypeInIn, Integer ServiceInternalIdIn, Integer ServiceInternalIdResetsIn) {
    super(id, context, "InvsTypeValidateCreate");
    InvsTypeIn = InvsTypeInIn;
    ServiceInternalId = ServiceInternalIdIn;
    ServiceInternalIdResets = ServiceInternalIdResetsIn;
  }

  public void translateToMap() {
    if (InvsTypeIn != null) {
      InvsTypeIn.resetFlags(true, true);
      addInput("InvsTypeValidate", InvsTypeObjectHelper.toMap(InvsTypeIn, new HashMap(), "InvsTypeValidate").get("InvsTypeValidate"));
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
 * Sets the InvsTypeValidate
 * @param InvsTypeInIn Value of the InvsTypeIn
 *
 */

  public void setInvsTypeValidate(InvsTypeObjectData InvsTypeInIn) {
    InvsTypeIn = InvsTypeInIn;
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
    InvsTypeIn = InvsTypeObjectHelper.fromMap(inputMap, "InvsTypeValidate");
    ServiceInternalId = (Integer)inputMap.get("ServiceInternalId");
    ServiceInternalIdResets = (Integer)inputMap.get("ServiceInternalIdResets");
  }

/**
 *
 * Gets the InvsTypeValidate
 * @return Value of the InvsTypeValidate
 *
 */

  public InvsTypeObjectData getInvsTypeValidate( ) {
    return InvsTypeIn;
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
