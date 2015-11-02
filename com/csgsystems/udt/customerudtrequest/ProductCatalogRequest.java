/*
 * Generated code DO NOT EDIT
 * Generated file: ProductCatalogRequest.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;
import java.util.Map;
import java.util.Date;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.math.BigInteger;

import com.csgsystems.bp.data.*;
import com.csgsystems.cf.data.*;
public final class ProductCatalogRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProductCatalogRequest (String request, ProductCatalogRequestMethod method) {
    initialize(request, "ProductCatalog", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProductCatalogRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCheckTypeForContractTypeFindEligible(Integer data) {
    if (data != null) {
      addInput("CheckType", data);
    }
  }
  public void setContractTypeForContractTypeFindEligible(ContractTypeObjectFilter data) {
    if (data != null) {
      addInput("ContractType", ContractTypeObjectHelper.toMap(data, new HashMap(), "ContractType").get("ContractType"));
    }
  }
  public void setEffectiveDateForContractTypeFindEligible(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setEntityForContractTypeFindEligible(EntityObjectData data) {
    if (data != null) {
      addInput("Entity", EntityObjectHelper.toMap(data, new HashMap(), "Entity").get("Entity"));
    }
  }
  public void setCheckTypeForExternalIdTypeFindEligible(Integer data) {
    if (data != null) {
      addInput("CheckType", data);
    }
  }
  public void setEffectiveDateForExternalIdTypeFindEligible(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setEntityForExternalIdTypeFindEligible(EntityObjectData data) {
    if (data != null) {
      addInput("Entity", EntityObjectHelper.toMap(data, new HashMap(), "Entity").get("Entity"));
    }
  }
  public void setExternalIdTypeForExternalIdTypeFindEligible(ExternalIdTypeObjectFilter data) {
    if (data != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(data, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
  }
  public void setAddressIdForInvsTypeFindEligible(Integer data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setCheckTypeForInvsTypeFindEligible(Integer data) {
    if (data != null) {
      addInput("CheckType", data);
    }
  }
  public void setEffectiveDateForInvsTypeFindEligible(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setEntityForInvsTypeFindEligible(EntityObjectData data) {
    if (data != null) {
      addInput("Entity", EntityObjectHelper.toMap(data, new HashMap(), "Entity").get("Entity"));
    }
  }
  public void setInvsTypeForInvsTypeFindEligible(InvsTypeObjectFilter data) {
    if (data != null) {
      addInput("InvsType", InvsTypeObjectHelper.toMap(data, new HashMap(), "InvsType").get("InvsType"));
    }
  }
  public void setCheckTypeForNrcTransDescrFindEligible(Integer data) {
    if (data != null) {
      addInput("CheckType", data);
    }
  }
  public void setEffectiveDateForNrcTransDescrFindEligible(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setEntityForNrcTransDescrFindEligible(EntityObjectData data) {
    if (data != null) {
      addInput("Entity", EntityObjectHelper.toMap(data, new HashMap(), "Entity").get("Entity"));
    }
  }
  public void setNrcTransDescrForNrcTransDescrFindEligible(NrcTransDescrObjectFilter data) {
    if (data != null) {
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(data, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
  }
  public void setAddressIdForPackageComponentDefFindEligible(Integer data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setCheckTypeForPackageComponentDefFindEligible(Integer data) {
    if (data != null) {
      addInput("CheckType", data);
    }
  }
  public void setEffectiveDateForPackageComponentDefFindEligible(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setEntityForPackageComponentDefFindEligible(EntityObjectData data) {
    if (data != null) {
      addInput("Entity", EntityObjectHelper.toMap(data, new HashMap(), "Entity").get("Entity"));
    }
  }
  public void setIndustryTypeForPackageComponentDefFindEligible(Integer[] data) {
    if (data != null) {
      addInput("IndustryTypeList", data);
    }
  }
  public void setPackageComponentDefForPackageComponentDefFindEligible(PCDObjectFilter data) {
    if (data != null) {
      addInput("PackageComponentDef", PCDObjectHelper.toMap(data, new HashMap(), "PackageComponentDef").get("PackageComponentDef"));
    }
  }
  public void setAddressIdForPackageDefinitionFindEligible(Integer data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setCheckTypeForPackageDefinitionFindEligible(Integer data) {
    if (data != null) {
      addInput("CheckType", data);
    }
  }
  public void setEffectiveDateForPackageDefinitionFindEligible(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setEntityForPackageDefinitionFindEligible(EntityObjectData data) {
    if (data != null) {
      addInput("Entity", EntityObjectHelper.toMap(data, new HashMap(), "Entity").get("Entity"));
    }
  }
  public void setIndustryTypeForPackageDefinitionFindEligible(Integer[] data) {
    if (data != null) {
      addInput("IndustryTypeList", data);
    }
  }
  public void setLevelForPackageDefinitionFindEligible(Integer data) {
    if (data != null) {
      addInput("Level", data);
    }
  }
  public void setPackageDefinitionForPackageDefinitionFindEligible(PDObjectFilter data) {
    if (data != null) {
      addInput("PackageDefinition", PDObjectHelper.toMap(data, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
  }
  public void setAddressIdForProductElementFindEligible(Integer data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setCheckTypeForProductElementFindEligible(Integer data) {
    if (data != null) {
      addInput("CheckType", data);
    }
  }
  public void setEffectiveDateForProductElementFindEligible(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setEntityForProductElementFindEligible(EntityObjectData data) {
    if (data != null) {
      addInput("Entity", EntityObjectHelper.toMap(data, new HashMap(), "Entity").get("Entity"));
    }
  }
  public void setIndustryTypeForProductElementFindEligible(Integer[] data) {
    if (data != null) {
      addInput("IndustryTypeList", data);
    }
  }
  public void setProductElementForProductElementFindEligible(ProductElementObjectFilter data) {
    if (data != null) {
      addInput("ProductElement", ProductElementObjectHelper.toMap(data, new HashMap(), "ProductElement").get("ProductElement"));
    }
  }
  public void setAddressIdForServicePricingPlanFindEligible(Integer data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setCheckTypeForServicePricingPlanFindEligible(Integer data) {
    if (data != null) {
      addInput("CheckType", data);
    }
  }
  public void setEffectiveDateForServicePricingPlanFindEligible(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setEntityForServicePricingPlanFindEligible(EntityObjectData data) {
    if (data != null) {
      addInput("Entity", EntityObjectHelper.toMap(data, new HashMap(), "Entity").get("Entity"));
    }
  }
  public void setIndustryTypeForServicePricingPlanFindEligible(Integer[] data) {
    if (data != null) {
      addInput("IndustryTypeList", data);
    }
  }
  public void setServicePricingPlanForServicePricingPlanFindEligible(ServicePricingPlanObjectFilter data) {
    if (data != null) {
      addInput("ServicePricingPlan", ServicePricingPlanObjectHelper.toMap(data, new HashMap(), "ServicePricingPlan").get("ServicePricingPlan"));
    }
  }
  public ContractTypeObjectDataList getContractTypeObjectDataContractTypeFromContractTypeFindEligible() {
    return ContractTypeObjectHelper.fromMapList(outputMap, "ContractTypeList");
  }
  public ExternalIdTypeObjectDataList getExternalIdTypeObjectDataExternalIdTypeFromExternalIdTypeFindEligible() {
    return ExternalIdTypeObjectHelper.fromMapList(outputMap, "ExternalIdTypeList");
  }
  public InvsTypeObjectDataList getInvsTypeObjectDataInvsTypeFromInvsTypeFindEligible() {
    return InvsTypeObjectHelper.fromMapList(outputMap, "InvsTypeList");
  }
  public NrcTransDescrObjectDataList getNrcTransDescrObjectDataNrcTransDescrFromNrcTransDescrFindEligible() {
    return NrcTransDescrObjectHelper.fromMapList(outputMap, "NrcTransDescrList");
  }
  public PCDObjectDataList getPCDObjectDataPackageComponentDefFromPackageComponentDefFindEligible() {
    return PCDObjectHelper.fromMapList(outputMap, "PackageComponentDefList");
  }
  public PDObjectDataList getPDObjectDataPackageDefinitionFromPackageDefinitionFindEligible() {
    return PDObjectHelper.fromMapList(outputMap, "PackageDefinitionList");
  }
  public ProductElementObjectDataList getProductElementObjectDataProductElementFromProductElementFindEligible() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
  }
  public ServicePricingPlanObjectDataList getServicePricingPlanObjectDataServicePricingPlanFromServicePricingPlanFindEligible() {
    return ServicePricingPlanObjectHelper.fromMapList(outputMap, "ServicePricingPlanList");
  }
  /**
   @deprecated
   */
  public void setAddressId(Integer data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  /**
   @deprecated
   */
  public void setCheckType(Integer data) {
    if (data != null) {
      addInput("CheckType", data);
    }
  }
  /**
   @deprecated
   */
  public void setContractTypeObjectFilter(ContractTypeObjectFilter data) {
    if (data != null) {
      addInput("ContractType", ContractTypeObjectHelper.toMap(data, new HashMap()).get("ContractTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public ContractTypeObjectDataList getContractTypeObjectDataList() {
    return ContractTypeObjectHelper.fromMapList(outputMap, "ContractTypeList");
  }
  /**
   @deprecated
   */
  public void setEffectiveDate(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setEntityObjectDataArray(EntityObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = EntityObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      addInput("EntityList", list);
    }
  }
  /**
   @deprecated
   */
  public void setExternalIdTypeObjectFilter(ExternalIdTypeObjectFilter data) {
    if (data != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(data, new HashMap()).get("ExternalIdTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public ExternalIdTypeObjectDataList getExternalIdTypeObjectDataList() {
    return ExternalIdTypeObjectHelper.fromMapList(outputMap, "ExternalIdTypeList");
  }
  /**
   @deprecated
   */
  public void setIndustryType(Integer data) {
    if (data != null) {
      addInput("IndustryType", data);
    }
  }
  /**
   @deprecated
   */
  public void setInvsTypeObjectFilter(InvsTypeObjectFilter data) {
    if (data != null) {
      addInput("InvsType", InvsTypeObjectHelper.toMap(data, new HashMap()).get("InvsTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsTypeObjectDataList getInvsTypeObjectDataList() {
    return InvsTypeObjectHelper.fromMapList(outputMap, "InvsTypeList");
  }
  /**
   @deprecated
   */
  public void setLevel(Integer data) {
    if (data != null) {
      addInput("Level", data);
    }
  }
  /**
   @deprecated
   */
  public void setNrcTransDescrObjectFilter(NrcTransDescrObjectFilter data) {
    if (data != null) {
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(data, new HashMap()).get("NrcTransDescrObject"));
    }
  }
  /**
   @deprecated
   */
  public NrcTransDescrObjectDataList getNrcTransDescrObjectDataList() {
    return NrcTransDescrObjectHelper.fromMapList(outputMap, "NrcTransDescrList");
  }
  /**
   @deprecated
   */
  public void setPCDObjectFilter(PCDObjectFilter data) {
    if (data != null) {
      addInput("PCD", PCDObjectHelper.toMap(data, new HashMap()).get("PCDObject"));
    }
  }
  /**
   @deprecated
   */
  public PCDObjectDataList getPCDObjectDataList() {
    return PCDObjectHelper.fromMapList(outputMap, "PCDList");
  }
  /**
   @deprecated
   */
  public void setPDObjectFilter(PDObjectFilter data) {
    if (data != null) {
      addInput("PD", PDObjectHelper.toMap(data, new HashMap()).get("PDObject"));
    }
  }
  /**
   @deprecated
   */
  public PDObjectDataList getPDObjectDataList() {
    return PDObjectHelper.fromMapList(outputMap, "PDList");
  }
  /**
   @deprecated
   */
  public void setProductElementObjectFilter(ProductElementObjectFilter data) {
    if (data != null) {
      addInput("ProductElement", ProductElementObjectHelper.toMap(data, new HashMap()).get("ProductElementObject"));
    }
  }
  /**
   @deprecated
   */
  public ProductElementObjectDataList getProductElementObjectDataList() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
  }
  /**
   @deprecated
   */
  public void setServicePricingPlanObjectFilter(ServicePricingPlanObjectFilter data) {
    if (data != null) {
      addInput("ServicePricingPlan", ServicePricingPlanObjectHelper.toMap(data, new HashMap()).get("ServicePricingPlanObject"));
    }
  }
  /**
   @deprecated
   */
  public ServicePricingPlanObjectDataList getServicePricingPlanObjectDataList() {
    return ServicePricingPlanObjectHelper.fromMapList(outputMap, "ServicePricingPlanList");
  }
}
