<#--
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
-->
<#-- This file has been modified by Open Source Strategies, Inc. -->

<div class="screenlet">
    <div class="screenlet-header">
        <div class="boxhead">&nbsp;${survey.surveyName}</div>
    </div>
    <div class="screenlet-body">
        <#-- Render the survey -->
        <#if surveyWrapper?has_content>
            <form method="post" enctype="multipart/form-data" action="<@ofbizUrl>profilesurvey/profilesurvey</@ofbizUrl>" style="margin: 0;">
              ${surveyWrapper.render()}
            </form>
        <#else>
            <h1>${uiLabelMap.OrderNothingToDoHere}</h1>
        </#if>
    </div>
</div>